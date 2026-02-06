package gui.Consultorio;

import javax.swing.*;
import java.awt.*;

public class GUIConsultorioConsultar extends JFrame {

    // MODOS
    public static final int ADICIONAR = 1;
    public static final int CONSULTAR = 2;
    public static final int MODIFICAR = 3;
    public static final int ELIMINAR = 4;

    private JTextField txtCodigo, txtNombre, txtPiso;
    private JComboBox cboEspecialidad, cboEstado;
    private JTextArea txtObservacion;
    private JButton btnGuardar, btnCancelar, btnEliminar;

    // 🔹 CONSTRUCTOR VACÍO (NECESARIO PARA EL MENÚ)
    public GUIConsultorioConsultar() {
        this(CONSULTAR);
    }

    // 🔹 CONSTRUCTOR CON MODO
    public GUIConsultorioConsultar(int modo) {

        setSize(501, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblTitulo = new JLabel("CONSULTAR CONSULTORIO", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setBounds(80, 10, 330, 25);
        getContentPane().add(lblTitulo);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(40, 50, 120, 20);
        getContentPane().add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(190, 50, 230, 20);
        getContentPane().add(txtCodigo);

        JLabel lblNombre = new JLabel("Consultorio:");
        lblNombre.setBounds(40, 80, 120, 20);
        getContentPane().add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(190, 80, 230, 20);
        getContentPane().add(txtNombre);

        JLabel lblPiso = new JLabel("Piso:");
        lblPiso.setBounds(40, 110, 120, 20);
        getContentPane().add(lblPiso);

        txtPiso = new JTextField();
        txtPiso.setBounds(190, 110, 230, 20);
        getContentPane().add(txtPiso);

        JLabel lblEspecialidad = new JLabel("Especialidad:");
        lblEspecialidad.setBounds(40, 140, 120, 20);
        getContentPane().add(lblEspecialidad);

        cboEspecialidad = new JComboBox(new String[]{
                "Medicina General", "Pediatria", "Cardiologia", "Traumatologia"
        });
        cboEspecialidad.setBounds(190, 140, 230, 20);
        getContentPane().add(cboEspecialidad);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(40, 170, 120, 20);
        getContentPane().add(lblEstado);

        cboEstado = new JComboBox(new String[]{
                "Disponible", "Ocupado", "Mantenimiento", "Inactivo"
        });
        cboEstado.setBounds(190, 170, 230, 20);
        getContentPane().add(cboEstado);

        JLabel lblObs = new JLabel("Observación:");
        lblObs.setBounds(40, 200, 120, 20);
        getContentPane().add(lblObs);

        txtObservacion = new JTextArea();
        JScrollPane scroll = new JScrollPane(txtObservacion);
        scroll.setBounds(190, 200, 230, 60);
        getContentPane().add(scroll);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(80, 270, 110, 30);
        getContentPane().add(btnGuardar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(200, 270, 110, 30);
        getContentPane().add(btnEliminar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(320, 270, 110, 30);
        getContentPane().add(btnCancelar);

        configurarModo(modo, lblTitulo);
    }

    private void configurarModo(int modo, JLabel lblTitulo) {

        switch (modo) {

            case ADICIONAR:
                setTitle("Adicionar Consultorio");
                lblTitulo.setText("ADICIONAR CONSULTORIO");
                habilitarCampos(true);
                txtCodigo.setEditable(true);
                btnGuardar.setEnabled(true);
                btnEliminar.setEnabled(false);
                break;

            case CONSULTAR:
                setTitle("Consultar Consultorio");
                lblTitulo.setText("CONSULTAR CONSULTORIO");
                habilitarCampos(false);
                btnGuardar.setEnabled(false);
                btnEliminar.setEnabled(false);
                break;

            case MODIFICAR:
                setTitle("Modificar Consultorio");
                lblTitulo.setText("MODIFICAR CONSULTORIO");
                habilitarCampos(true);
                txtCodigo.setEditable(false);
                btnGuardar.setEnabled(true);
                btnEliminar.setEnabled(false);
                break;

            case ELIMINAR:
                setTitle("Eliminar Consultorio");
                lblTitulo.setText("ELIMINAR CONSULTORIO");
                habilitarCampos(false);
                btnGuardar.setEnabled(false);
                btnEliminar.setEnabled(true);
                break;
        }
    }

    private void habilitarCampos(boolean estado) {
        txtNombre.setEditable(estado);
        txtPiso.setEditable(estado);
        cboEspecialidad.setEnabled(estado);
        cboEstado.setEnabled(estado);
        txtObservacion.setEditable(estado);
    }
}
