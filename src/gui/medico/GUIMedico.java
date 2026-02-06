package gui.medico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

import clases.Medico;

public class GUIMedico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtEspecialidad;
	private JTextField txtCmp;
	private JComboBox<String> cmbEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMedico frame = new GUIMedico();
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
	public GUIMedico() {
		setTitle("Adicionar Medico");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 501, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Título
		JLabel lblTitulo = new JLabel("REGISTRO DE MEDICO");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(140, 11, 220, 25);
		contentPane.add(lblTitulo);
		
		// Código Médico
		JLabel lblCodigo = new JLabel("Codigo Medico:");
		lblCodigo.setBounds(30, 50, 120, 20);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(150, 50, 100, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		// Nombres
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(30, 85, 120, 20);
		contentPane.add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(150, 85, 300, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		// Apellidos
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(30, 120, 120, 20);
		contentPane.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(150, 120, 300, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		// Especialidad
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setBounds(30, 155, 120, 20);
		contentPane.add(lblEspecialidad);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setBounds(150, 155, 200, 20);
		contentPane.add(txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
		// CMP (Colegio Médico del Perú)
		JLabel lblCmp = new JLabel("CMP:");
		lblCmp.setBounds(30, 190, 120, 20);
		contentPane.add(lblCmp);
		
		txtCmp = new JTextField();
		txtCmp.setBounds(150, 190, 120, 20);
		contentPane.add(txtCmp);
		txtCmp.setColumns(10);
		
		// Estado
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(30, 225, 120, 20);
		contentPane.add(lblEstado);
		
		cmbEstado = new JComboBox<String>();
		cmbEstado.setModel(new DefaultComboBoxModel<String>(new String[] {"Inactivo", "Activo"}));
		cmbEstado.setBounds(150, 225, 120, 22);
		contentPane.add(cmbEstado);
		
		// Botón Registrar
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setIcon(new ImageIcon(GUIMedico.class.getResource("/img/paciente.png")));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrarMedico();
			}
		});
		btnRegistrar.setBounds(150, 270, 130, 30);
		contentPane.add(btnRegistrar);
		
		// Botón Cancelar
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(GUIMedico.class.getResource("/img/informe-medico.png")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
			}
		});
		btnCancelar.setBounds(300, 270, 130, 30);
		contentPane.add(btnCancelar);
		
		generarCodigoAutomatico();
	}
	
	/**
	 * Genera un código automático para el médico
	 */
	private void generarCodigoAutomatico() {
		// TODO: generar el código correlativo
		// Por ahora se genera un código de ejemplo
		int codigoGenerado = (int) (Math.random() * 10000) + 1;
		txtCodigo.setText(String.valueOf(codigoGenerado));
	}
	
	/**
	 * Registra un nuevo médico
	 * @author Roger Rojas
	 */
	private void registrarMedico() {
		try {
			// Validar campos
			if (validarCampos()) {
				int codMedico = Integer.parseInt(txtCodigo.getText().trim());
				String nombres = txtNombres.getText().trim();
				String apellidos = txtApellidos.getText().trim();
				String especialidad = txtEspecialidad.getText().trim();
				String cmp = txtCmp.getText().trim();
				int estado = cmbEstado.getSelectedIndex(); // 0 = Inactivo, 1 = Activo
				
				// Crear objeto Medico
				Medico medico = new Medico(codMedico, nombres, apellidos, especialidad, cmp, estado);
				
				// Aquí se debería agregar la lógica para guardar en base de datos o archivo
				// Por ahora solo mostramos un mensaje
				JOptionPane.showMessageDialog(this, 
					"Médico registrado exitosamente:\n" +
					"Código: " + codMedico + "\n" +
					"Nombre: " + nombres + " " + apellidos + "\n" +
					"Especialidad: " + especialidad + "\n" +
					"CMP: " + cmp,
					"Registro Exitoso", 
					JOptionPane.INFORMATION_MESSAGE);
				
				// Limpiar campos después del registro
				limpiarCampos();
				generarCodigoAutomatico();
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, 
				"Error en el formato de los datos numéricos", 
				"Error", 
				JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, 
				"Error al registrar médico: " + e.getMessage(), 
				"Error", 
				JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Valida que los campos obligatorios estén completos
	 * @author Roger Rojas
	 */
	private boolean validarCampos() {
		if (txtNombres.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, 
				"Por favor ingrese los nombres del médico", 
				"Campo requerido", 
				JOptionPane.WARNING_MESSAGE);
			txtNombres.requestFocus();
			return false;
		}
		
		if (txtApellidos.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, 
				"Por favor ingrese los apellidos del médico", 
				"Campo requerido", 
				JOptionPane.WARNING_MESSAGE);
			txtApellidos.requestFocus();
			return false;
		}
		
		if (txtEspecialidad.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, 
				"Por favor ingrese la especialidad del médico", 
				"Campo requerido", 
				JOptionPane.WARNING_MESSAGE);
			txtEspecialidad.requestFocus();
			return false;
		}
		
		if (txtCmp.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, 
				"Por favor ingrese el CMP del médico", 
				"Campo requerido", 
				JOptionPane.WARNING_MESSAGE);
			txtCmp.requestFocus();
			return false;
		}
		
		return true;
	}
	
	/**
	 * Limpia todos los campos del formulario
	 * @author Roger Rojas
	 */
	private void limpiarCampos() {
		txtNombres.setText("");
		txtApellidos.setText("");
		txtEspecialidad.setText("");
		txtCmp.setText("");
		cmbEstado.setSelectedIndex(0);
		txtNombres.requestFocus();
	}
}
