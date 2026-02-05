package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;

public class GUIPacienteConModEli extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable tblPaciente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIPacienteConModEli frame = new GUIPacienteConModEli();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIPacienteConModEli() {
		setTitle("Registrar al Paciente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 538, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(216, 10, 1, 1);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Codigo Paciente");
		lblNewLabel.setBounds(20, 11, 105, 31);
		contentPane_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(116, 16, 86, 20);
		contentPane_1.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Paciente");
		lblNewLabel_1.setBounds(20, 41, 89, 20);
		contentPane_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 41, 212, 20);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 72, 212, 20);
		contentPane_1.add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos Paciente");
		lblNewLabel_2.setBounds(20, 68, 89, 28);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DNI ");
		lblNewLabel_3.setBounds(48, 107, 46, 14);
		contentPane_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Edad");
		lblNewLabel_4.setBounds(48, 132, 46, 14);
		contentPane_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Celular");
		lblNewLabel_5.setBounds(48, 159, 46, 14);
		contentPane_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Correo");
		lblNewLabel_6.setBounds(48, 184, 46, 14);
		contentPane_1.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 104, 86, 20);
		contentPane_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(116, 132, 86, 20);
		contentPane_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(116, 156, 86, 20);
		contentPane_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(116, 181, 152, 20);
		contentPane_1.add(textField_6);
		
		JLabel lblNewLabel_7 = new JLabel("Estado");
		lblNewLabel_7.setBounds(48, 216, 46, 14);
		contentPane_1.add(lblNewLabel_7);
		
		JComboBox cbmestado = new JComboBox();
		cbmestado.setEditable(true);
		cbmestado.setBounds(116, 212, 86, 22);
		contentPane_1.add(cbmestado);
		
		JButton btnregistrar = new JButton("Registrar");
		btnregistrar.setIcon(new ImageIcon(GUIPacienteConModEli.class.getResource("/img/paciente.png")));
		btnregistrar.setBounds(298, 180, 105, 23);
		contentPane_1.add(btnregistrar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setIcon(new ImageIcon(GUIPacienteConModEli.class.getResource("/img/informe-medico.png")));
		btncancelar.setBounds(298, 227, 105, 23);
		contentPane_1.add(btncancelar);
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_2.setBounds(0, 0, 430, 261);
		contentPane.add(contentPane_2);
		contentPane_2.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Codigo Paciente");
		lblNewLabel_8.setBounds(20, 11, 105, 31);
		contentPane_2.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(116, 16, 86, 20);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		contentPane_2.add(textField_7);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre Paciente");
		lblNewLabel_1_1.setBounds(20, 41, 89, 20);
		contentPane_2.add(lblNewLabel_1_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(116, 41, 212, 20);
		textField_8.setColumns(10);
		contentPane_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(116, 72, 212, 20);
		textField_9.setColumns(10);
		contentPane_2.add(textField_9);
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellidos Paciente");
		lblNewLabel_2_1.setBounds(20, 68, 89, 28);
		contentPane_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("DNI ");
		lblNewLabel_3_1.setBounds(48, 107, 46, 14);
		contentPane_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Edad");
		lblNewLabel_4_1.setBounds(48, 132, 46, 14);
		contentPane_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Celular");
		lblNewLabel_5_1.setBounds(48, 159, 46, 14);
		contentPane_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Correo");
		lblNewLabel_6_1.setBounds(48, 184, 46, 14);
		contentPane_2.add(lblNewLabel_6_1);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(116, 104, 86, 20);
		textField_10.setColumns(10);
		contentPane_2.add(textField_10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(116, 156, 86, 20);
		textField_12.setColumns(10);
		contentPane_2.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setBounds(116, 181, 152, 20);
		textField_13.setColumns(10);
		contentPane_2.add(textField_13);
		
		JLabel lblNewLabel_7_1 = new JLabel("Estado");
		lblNewLabel_7_1.setBounds(48, 216, 46, 14);
		contentPane_2.add(lblNewLabel_7_1);
		
		JComboBox cbmestado_1 = new JComboBox();
		cbmestado_1.setBounds(116, 212, 86, 22);
		cbmestado_1.setEditable(true);
		contentPane_2.add(cbmestado_1);
		
		JButton btnregistrar_1 = new JButton("Eliminar");
		btnregistrar_1.setBounds(298, 180, 105, 23);
		btnregistrar_1.setIcon(new ImageIcon(GUIPacienteConModEli.class.getResource("/img/paciente.png")));
		contentPane_2.add(btnregistrar_1);
		
		JButton btncancelar_1 = new JButton("Cancelar");
		btncancelar_1.setBounds(298, 227, 105, 23);
		btncancelar_1.setIcon(new ImageIcon(GUIPacienteConModEli.class.getResource("/img/informe-medico.png")));
		contentPane_2.add(btncancelar_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(116, 129, 60, 20);
		contentPane_2.add(spinner);
		
		JButton btnregistrar_1_1 = new JButton("Modificar");
		btnregistrar_1_1.setIcon(new ImageIcon(GUIPacienteConModEli.class.getResource("/img/paciente.png")));
		btnregistrar_1_1.setBounds(298, 128, 105, 23);
		contentPane_2.add(btnregistrar_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 291, 454, 144);
		contentPane.add(scrollPane);
		
		tblPaciente = new JTable();
		tblPaciente.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(tblPaciente);

	}
}
