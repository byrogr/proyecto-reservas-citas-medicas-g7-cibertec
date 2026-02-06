package gui.RegistroCitas;

import javax.swing.*;
import java.awt.*;

public class GUIRegistroCitasConsultar extends JFrame {

    // MODOS
    public static final int CONSULTAR = 1;
    public static final int MODIFICAR = 2;
    public static final int ELIMINAR = 3;

    private JTextField txtCodigo, txtFecha, txtHora;
    private JComboBox cboPaciente, cboMedico, cboConsultorio, cboEstado;
    private JButton btnGuardar, btnEliminar, btnCancelar;

    // Constructor vacío (por defecto CONSULTAR)
    public GUIRegistroCitasConsultar() {
        this(CONSULTAR);
    }

    public GUIRegistroCitasConsultar(int modo) {

        setSize(501, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblTitulo = new JLabel("CONSULTAR REGISTRO DE CITAS", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setBounds(80, 10, 330, 25);
        getContentPane().add(lblTitulo);

        JLabel lblCodigo = new JLabel("Código Cita:");
        lblCodigo.setBounds(40, 50, 120, 20);
        getContentPane().add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(190, 50, 230, 20);
        getContentPane().add(txtCodigo);

        JLabel lblPaciente = new JLabel("Paciente:");
        lblPaciente.setBounds(40, 80, 120, 20);
        getContentPane().add(lblPaciente);

        cboPaciente = new JComboBox();
        cboPaciente.setBounds(190, 80, 230, 20);
        getContentPane().add(cboPaciente);

        JLabel lblMedico = new JLabel("Médico:");
        lblMedico.setBounds(40, 110, 120, 20);
        getContentPane().add(lblMedico);

        cboMedico = new JComboBox();
        cboMedico.setBounds(190, 110, 230, 20);
        getContentPane().add(cboMedico);

        JLabel lblConsultorio = new JLabel("Consultorio:");
        lblConsultorio.setBounds(40, 140, 120, 20);
        getContentPane().add(lblConsultorio);

        cboConsultorio = new JComboBox();
        cboConsultorio.setBounds(190, 140, 230, 20);
        getContentPane().add(cboConsultorio);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(40, 170, 120, 20);
        getContentPane().add(lblFecha);

        txtFecha = new JTextField();
        txtFecha.setBounds(190, 170, 230, 20);
        getContentPane().add(txtFecha);

        JLabel lblHora = new JLabel("Hora:");
        lblHora.setBounds(40, 200, 120, 20);
        getContentPane().add(lblHora);

        txtHora = new JTextField();
        txtHora.setBounds(190, 200, 230, 20);
        getContentPane().add(txtHora);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(40, 230, 120, 20);
        getContentPane().add(lblEstado);

        cboEstado = new JComboBox();
        cboEstado.setModel(new DefaultComboBoxModel(
                new String[]{"Programada", "Atendida", "Cancelada"}));
        cboEstado.setBounds(190, 230, 230, 20);
        getContentPane().add(cboEstado);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(60, 270, 110, 30);
        getContentPane().add(btnGuardar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(190, 270, 110, 30);
        getContentPane().add(btnEliminar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(320, 270, 110, 30);
        getContentPane().add(btnCancelar);

        configurarModo(modo, lblTitulo);
    }

    // CONFIGURACIÓN SEGÚN MODO
    private void configurarModo(int modo, JLabel lblTitulo) {

        switch (modo) {

            case CONSULTAR:
                setTitle("Consultar Cita Médica");
                lblTitulo.setText("CONSULTAR CITA MÉDICA");
                habilitarCampos(false);
                btnGuardar.setEnabled(false);
                btnEliminar.setEnabled(false);
                break;

            case MODIFICAR:
                setTitle("Modificar Cita Médica");
                lblTitulo.setText("MODIFICAR CITA MÉDICA");
                habilitarCampos(true);
                txtCodigo.setEditable(false);
                btnGuardar.setEnabled(true);
                btnEliminar.setEnabled(false);
                break;

            case ELIMINAR:
                setTitle("Eliminar Cita Médica");
                lblTitulo.setText("ELIMINAR CITA MÉDICA");
                habilitarCampos(false);
                btnGuardar.setEnabled(false);
                btnEliminar.setEnabled(true);
                break;
        }
    }

    private void habilitarCampos(boolean estado) {
        txtFecha.setEditable(estado);
        txtHora.setEditable(estado);
        cboPaciente.setEnabled(estado);
        cboMedico.setEnabled(estado);
        cboConsultorio.setEnabled(estado);
        cboEstado.setEnabled(estado);
    }
}
