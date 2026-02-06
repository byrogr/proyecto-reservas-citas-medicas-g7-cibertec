package gui.Consultorio;

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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import clases.Consultorio;

public class GUIConsultorio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtUbicacion;
	private JSpinner spnPiso;
	private JSpinner spnCapacidad;
	private JComboBox<String> cmbEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIConsultorio frame = new GUIConsultorio();
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
	public GUIConsultorio() {
		setTitle("Adicionar Consultorio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Título
		JLabel lblTitulo = new JLabel("REGISTRO DE CONSULTORIO");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(120, 11, 260, 25);
		contentPane.add(lblTitulo);
		
		// Código Consultorio
		JLabel lblCodigo = new JLabel("Código Consultorio:");
		lblCodigo.setBounds(30, 50, 140, 20);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(170, 50, 100, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		// Nombre
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 85, 140, 20);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(170, 85, 280, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		// Piso
		JLabel lblPiso = new JLabel("Piso:");
		lblPiso.setBounds(30, 120, 140, 20);
		contentPane.add(lblPiso);
		
		spnPiso = new JSpinner();
		spnPiso.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		spnPiso.setBounds(170, 120, 100, 20);
		contentPane.add(spnPiso);
		
		// Ubicación
		JLabel lblUbicacion = new JLabel("Ubicación:");
		lblUbicacion.setBounds(30, 155, 140, 20);
		contentPane.add(lblUbicacion);
		
		txtUbicacion = new JTextField();
		txtUbicacion.setBounds(170, 155, 280, 20);
		contentPane.add(txtUbicacion);
		txtUbicacion.setColumns(10);
		
		// Capacidad
		JLabel lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setBounds(30, 190, 140, 20);
		contentPane.add(lblCapacidad);
		
		spnCapacidad = new JSpinner();
		spnCapacidad.setModel(new SpinnerNumberModel(1, 1, 50, 1));
		spnCapacidad.setBounds(170, 190, 100, 20);
		contentPane.add(spnCapacidad);
		
		JLabel lblPersonas = new JLabel("personas");
		lblPersonas.setBounds(280, 190, 80, 20);
		contentPane.add(lblPersonas);
		
		// Estado
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(30, 225, 140, 20);
		contentPane.add(lblEstado);
		
		cmbEstado = new JComboBox<String>();
		cmbEstado.setModel(new DefaultComboBoxModel<String>(new String[] {"Inactivo", "Activo"}));
		cmbEstado.setBounds(170, 225, 120, 22);
		contentPane.add(cmbEstado);
		
		// Botón Registrar
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setIcon(new ImageIcon(GUIConsultorio.class.getResource("/img/paciente.png")));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrarConsultorio();
			}
		});
		btnRegistrar.setBounds(150, 280, 130, 30);
		contentPane.add(btnRegistrar);
		
		// Botón Cancelar
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(GUIConsultorio.class.getResource("/img/informe-medico.png")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
			}
		});
		btnCancelar.setBounds(300, 280, 130, 30);
		contentPane.add(btnCancelar);
		
		generarCodigoAutomatico();
	}
	
	/**
	 * Genera un código automático para el consultorio
	 */
	private void generarCodigoAutomatico() {
		// TODO: generar el código correlativo
		// Por ahora se genera un código de ejemplo
		int codigoGenerado = (int) (Math.random() * 10000) + 1;
		txtCodigo.setText(String.valueOf(codigoGenerado));
	}
	
	/**
	 * Registra un nuevo consultorio
	 */
	private void registrarConsultorio() {
		try {
			// Validar campos
			if (validarCampos()) {
				int codConsultorio = Integer.parseInt(txtCodigo.getText().trim());
				String nombre = txtNombre.getText().trim();
				int piso = (int) spnPiso.getValue();
				String ubicacion = txtUbicacion.getText().trim();
				int capacidad = (int) spnCapacidad.getValue();
				int estado = cmbEstado.getSelectedIndex(); // 0 = Inactivo, 1 = Activo
				
				// Crear objeto Consultorio
				Consultorio consultorio = new Consultorio(codConsultorio, nombre, piso, ubicacion, capacidad, estado);
				
				// Aquí se debería agregar la lógica para guardar en base de datos o archivo
				// Por ahora solo mostramos un mensaje
				JOptionPane.showMessageDialog(this, 
					"Consultorio registrado exitosamente:\n" +
					"Código: " + codConsultorio + "\n" +
					"Nombre: " + nombre + "\n" +
					"Piso: " + piso + "\n" +
					"Ubicación: " + ubicacion + "\n" +
					"Capacidad: " + capacidad + " personas",
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
				"Error al registrar consultorio: " + e.getMessage(), 
				"Error", 
				JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Valida que los campos obligatorios estén completos
	 */
	private boolean validarCampos() {
		if (txtNombre.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, 
				"Por favor ingrese el nombre del consultorio", 
				"Campo requerido", 
				JOptionPane.WARNING_MESSAGE);
			txtNombre.requestFocus();
			return false;
		}
		
		if (txtUbicacion.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, 
				"Por favor ingrese la ubicación del consultorio", 
				"Campo requerido", 
				JOptionPane.WARNING_MESSAGE);
			txtUbicacion.requestFocus();
			return false;
		}
		
		return true;
	}
	
	/**
	 * Limpia todos los campos del formulario
	 */
	private void limpiarCampos() {
		txtNombre.setText("");
		txtUbicacion.setText("");
		spnPiso.setValue(1);
		spnCapacidad.setValue(1);
		cmbEstado.setSelectedIndex(0);
	}
}
