package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class GUIAdicionarMedico2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigoMedico;
	private JTextField txtNombreMedico;
	private JTextField txtApellidoMedico;
	private JTextField txtCmpMedico;
	private JTextField txtEspecialidadMedico;
	private JTextField txtCelularMedico;
	private JTextField txtCorreoMedico;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public GUIAdicionarMedico2() {
		setTitle("Adicionar Medico");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoMedico = new JLabel("Codigo Medico");
		lblCodigoMedico.setBounds(20, 11, 105, 31);
		contentPane.add(lblCodigoMedico);
		
		txtCodigoMedico = new JTextField();
		txtCodigoMedico.setEditable(false);
		txtCodigoMedico.setBounds(141, 12, 86, 20);
		contentPane.add(txtCodigoMedico);
		txtCodigoMedico.setColumns(10);
		
		JLabel lblNombreMedico = new JLabel("Nombre ");
		lblNombreMedico.setBounds(20, 41, 89, 20);
		contentPane.add(lblNombreMedico);
		
		txtNombreMedico = new JTextField();
		txtNombreMedico.setBounds(141, 37, 212, 20);
		contentPane.add(txtNombreMedico);
		txtNombreMedico.setColumns(10);
		
		txtApellidoMedico = new JTextField();
		txtApellidoMedico.setBounds(141, 68, 212, 20);
		contentPane.add(txtApellidoMedico);
		txtApellidoMedico.setColumns(10);
		
		JLabel lblApellidosMedico = new JLabel("Apellidos ");
		lblApellidosMedico.setBounds(20, 68, 89, 28);
		contentPane.add(lblApellidosMedico);
		
		JLabel lblCmpMedico = new JLabel("CMP (Registro Medico)");
		lblCmpMedico.setBounds(20, 107, 119, 14);
		contentPane.add(lblCmpMedico);
		
		JLabel lblEspecialidadMedico = new JLabel("Especialidad");
		lblEspecialidadMedico.setBounds(20, 134, 78, 14);
		contentPane.add(lblEspecialidadMedico);
		
		JLabel lblCelularMedico = new JLabel("Celular");
		lblCelularMedico.setBounds(20, 159, 46, 14);
		contentPane.add(lblCelularMedico);
		
		JLabel lblCorreoMedico = new JLabel("Correo");
		lblCorreoMedico.setBounds(20, 184, 46, 14);
		contentPane.add(lblCorreoMedico);
		
		txtCmpMedico = new JTextField();
		txtCmpMedico.setBounds(141, 100, 86, 20);
		contentPane.add(txtCmpMedico);
		txtCmpMedico.setColumns(10);
		
		txtEspecialidadMedico = new JTextField();
		txtEspecialidadMedico.setBounds(141, 128, 86, 20);
		contentPane.add(txtEspecialidadMedico);
		txtEspecialidadMedico.setColumns(10);
		
		txtCelularMedico = new JTextField();
		txtCelularMedico.setBounds(141, 152, 86, 20);
		contentPane.add(txtCelularMedico);
		txtCelularMedico.setColumns(10);
		
		txtCorreoMedico = new JTextField();
		txtCorreoMedico.setBounds(141, 177, 152, 20);
		contentPane.add(txtCorreoMedico);
		txtCorreoMedico.setColumns(10);
		
		JLabel lblEstadoMedico = new JLabel("Estado");
		lblEstadoMedico.setBounds(20, 216, 46, 14);
		contentPane.add(lblEstadoMedico);
		
		JComboBox cbmEstadoMedico = new JComboBox();
		cbmEstadoMedico.setEditable(true);
		cbmEstadoMedico.setModel(new DefaultComboBoxModel(new String[] {"Activo", "Inactivo"}));
		cbmEstadoMedico.setBounds(141, 208, 105, 22);
		contentPane.add(cbmEstadoMedico);
		
		JButton btnRegistrarMedico = new JButton("Registrar");
		btnRegistrarMedico.setIcon(new ImageIcon(GUIAdicionarMedico2.class.getResource("/img/paciente.png")));
		btnRegistrarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrarMedico.setBounds(319, 175, 105, 23);
		contentPane.add(btnRegistrarMedico);
		
		JButton btnCancelarMedico = new JButton("Cancelar");
		btnCancelarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelarMedico.setIcon(new ImageIcon(GUIAdicionarMedico2.class.getResource("/img/informe-medico.png")));
		btnCancelarMedico.setBounds(319, 207, 105, 23);
		contentPane.add(btnCancelarMedico);

	}
}
