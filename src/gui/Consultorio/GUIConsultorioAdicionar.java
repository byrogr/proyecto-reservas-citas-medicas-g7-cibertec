package gui.Consultorio;
import javax.swing.*;
import java.awt.*;

public class GUIConsultorioAdicionar extends JFrame {

    private JTextField txtCodigo, txtNombre, txtPiso;
    private JComboBox cboEspecialidad, cboEstado;
    private JButton btnRegistrar;
    private JButton btnCancelar;
    private JScrollPane scrollPane;
    private JTextArea textArea;

    public GUIConsultorioAdicionar() {

        setTitle("Registro de Consultorio");
        setSize(501, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblTitulo = new JLabel("REGISTRO DE CONSULTORIO", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setBounds(70, 11, 330, 25);
        getContentPane().add(lblTitulo);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(30, 50, 120, 20);
        getContentPane().add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setEditable(false);
        txtCodigo.setEnabled(false);
        txtCodigo.setBounds(160, 50, 265, 20);
        getContentPane().add(txtCodigo);

        JLabel lblNombre = new JLabel("Consultorio:");
        lblNombre.setBounds(30, 80, 120, 20);
        getContentPane().add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(160, 80, 265, 20);
        getContentPane().add(txtNombre);

        JLabel lblPiso = new JLabel("Piso:");
        lblPiso.setBounds(30, 110, 120, 20);
        getContentPane().add(lblPiso);

        txtPiso = new JTextField();
        txtPiso.setBounds(160, 110, 265, 20);
        getContentPane().add(txtPiso);

        JLabel lblEspecialidad = new JLabel("Especialidad:");
        lblEspecialidad.setBounds(30, 140, 120, 20);
        getContentPane().add(lblEspecialidad);

        cboEspecialidad = new JComboBox();
        cboEspecialidad.setModel(new DefaultComboBoxModel(new String[] {"Medicina General", "Pediatria", "Cardiologia", "Traumatologia"}));
        cboEspecialidad.setBounds(160, 140, 265, 20);
        getContentPane().add(cboEspecialidad);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(30, 170, 120, 20);
        getContentPane().add(lblEstado);

        cboEstado = new JComboBox();
        cboEstado.setModel(new DefaultComboBoxModel(new String[] {"Disponible", "Ocupado", "Mantenimiento", "Inactivo"}));
        cboEstado.setBounds(160, 170, 265, 20);
        getContentPane().add(cboEstado);

        JLabel lblObs = new JLabel("Observación:");
        lblObs.setBounds(30, 200, 120, 20);
        getContentPane().add(lblObs);
        
        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setIcon(new ImageIcon(GUIConsultorioAdicionar.class.getResource("/img/paciente.png")));
        btnRegistrar.setBounds(100, 271, 130, 30);
        getContentPane().add(btnRegistrar);
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setIcon(new ImageIcon(GUIConsultorioAdicionar.class.getResource("/img/informe-medico.png")));
        btnCancelar.setBounds(270, 271, 130, 30);
        getContentPane().add(btnCancelar);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(160, 201, 265, 60);
        getContentPane().add(scrollPane);
        
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
    }

    public static void main(String[] args) {
        new GUIConsultorioAdicionar().setVisible(true);
    }
}
