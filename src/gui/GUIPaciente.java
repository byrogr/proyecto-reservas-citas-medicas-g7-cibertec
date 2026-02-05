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

public class GUIPaciente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcodigo;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtdni;
	private JTextField txtedad;
	private JTextField txtcelular;
	private JTextField txtcorreo;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public GUIPaciente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo Paciente");
		lblNewLabel.setBounds(20, 11, 105, 31);
		contentPane.add(lblNewLabel);
		
		txtcodigo = new JTextField();
		txtcodigo.setEditable(false);
		txtcodigo.setBounds(116, 16, 86, 20);
		contentPane.add(txtcodigo);
		txtcodigo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Paciente");
		lblNewLabel_1.setBounds(20, 41, 89, 20);
		contentPane.add(lblNewLabel_1);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(116, 41, 212, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setBounds(116, 72, 212, 20);
		contentPane.add(txtapellido);
		txtapellido.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos Paciente");
		lblNewLabel_2.setBounds(20, 68, 89, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DNI ");
		lblNewLabel_3.setBounds(48, 107, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Edad");
		lblNewLabel_4.setBounds(48, 132, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Celular");
		lblNewLabel_5.setBounds(48, 159, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Correo");
		lblNewLabel_6.setBounds(48, 184, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtdni = new JTextField();
		txtdni.setBounds(116, 104, 86, 20);
		contentPane.add(txtdni);
		txtdni.setColumns(10);
		
		txtedad = new JTextField();
		txtedad.setBounds(116, 132, 86, 20);
		contentPane.add(txtedad);
		txtedad.setColumns(10);
		
		txtcelular = new JTextField();
		txtcelular.setBounds(116, 156, 86, 20);
		contentPane.add(txtcelular);
		txtcelular.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(116, 181, 152, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Estado");
		lblNewLabel_7.setBounds(48, 216, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JComboBox cbmestado = new JComboBox();
		cbmestado.setEditable(true);
		cbmestado.setModel(new DefaultComboBoxModel(new String[] {"Hola", "hello", "hii"}));
		cbmestado.setBounds(116, 212, 86, 22);
		contentPane.add(cbmestado);
		
		JButton btnregistrar = new JButton("Registrar");
		btnregistrar.setIcon(new ImageIcon(GUIPaciente.class.getResource("/img/paciente.png")));
		btnregistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnregistrar.setBounds(298, 180, 105, 23);
		contentPane.add(btnregistrar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncancelar.setIcon(new ImageIcon(GUIPaciente.class.getResource("/img/informe-medico.png")));
		btncancelar.setBounds(298, 227, 105, 23);
		contentPane.add(btncancelar);

	}
}
