package gui.RegistroCitas;
import javax.swing.*;
import java.awt.*;

public class GUIRegistroCitasAdicionar extends JFrame {

    private JTextField txtCodigo, txtFecha, txtHora;
    private JComboBox cboPaciente, cboMedico, cboConsultorio, cboEstado;
    private JButton btnRegistrar, btnCancelar;

    public GUIRegistroCitasAdicionar() {
        setTitle("Registro de Citas Médicas");
        setSize(501, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblTitulo = new JLabel("REGISTRO DE CITA MÉDICA", SwingConstants.CENTER);
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

        txtFecha = new JTextField("dd/mm/yyyy");
        txtFecha.setBounds(190, 170, 230, 20);
        getContentPane().add(txtFecha);

        JLabel lblHora = new JLabel("Hora:");
        lblHora.setBounds(40, 200, 120, 20);
        getContentPane().add(lblHora);

        txtHora = new JTextField("hh:mm");
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

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(80, 270, 110, 30);
        getContentPane().add(btnRegistrar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(310, 270, 110, 30);
        getContentPane().add(btnCancelar);
    }
}
