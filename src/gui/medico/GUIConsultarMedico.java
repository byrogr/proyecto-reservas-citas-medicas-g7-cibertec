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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import clases.Medico;

public class GUIConsultarMedico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtEspecialidad;
	private JTextField txtCmp;
	private JComboBox<String> cmbEstado;
	private JTable tblMedicos;
	private DefaultTableModel modeloTabla;
	private JTextField txtBuscar;
	private JComboBox<String> cmbBuscarPor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIConsultarMedico frame = new GUIConsultarMedico();
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
	public GUIConsultarMedico() {
		setTitle("Consultar Medico");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Título
		JLabel lblTitulo = new JLabel("CONSULTA DE MEDICOS");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(230, 11, 240, 25);
		contentPane.add(lblTitulo);
		
		// Panel de búsqueda
		JPanel panelBusqueda = new JPanel();
		panelBusqueda.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelBusqueda.setBounds(20, 45, 645, 60);
		contentPane.add(panelBusqueda);
		panelBusqueda.setLayout(null);
		
		JLabel lblBuscarPor = new JLabel("Buscar por:");
		lblBuscarPor.setBounds(10, 10, 80, 20);
		panelBusqueda.add(lblBuscarPor);
		
		cmbBuscarPor = new JComboBox<String>();
		cmbBuscarPor.setModel(new DefaultComboBoxModel(new String[] {"Codigo", "Nombres", "Apellidos", "Especialidad", "CMP"}));
		cmbBuscarPor.setBounds(90, 10, 120, 22);
		panelBusqueda.add(cmbBuscarPor);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(220, 10, 250, 22);
		panelBusqueda.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(GUIConsultarMedico.class.getResource("/img/paciente.png")));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarMedico();
			}
		});
		btnBuscar.setBounds(480, 8, 120, 25);
		panelBusqueda.add(btnBuscar);
		
		JButton btnMostrarTodos = new JButton("Mostrar Todos");
		btnMostrarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarTodosLosMedicos();
			}
		});
		btnMostrarTodos.setBounds(480, 35, 120, 20);
		panelBusqueda.add(btnMostrarTodos);
		
		// Panel de datos del médico
		JPanel panelDatos = new JPanel();
		panelDatos.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelDatos.setBounds(20, 115, 645, 180);
		contentPane.add(panelDatos);
		panelDatos.setLayout(null);
		
		// Código Médico
		JLabel lblCodigo = new JLabel("Codigo Medico:");
		lblCodigo.setBounds(30, 15, 120, 20);
		panelDatos.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(150, 15, 100, 20);
		panelDatos.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		// Nombres
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(30, 50, 120, 20);
		panelDatos.add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setEditable(false);
		txtNombres.setBounds(150, 50, 300, 20);
		panelDatos.add(txtNombres);
		txtNombres.setColumns(10);
		
		// Apellidos
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(30, 85, 120, 20);
		panelDatos.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setBounds(150, 85, 300, 20);
		panelDatos.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		// Especialidad
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setBounds(30, 120, 120, 20);
		panelDatos.add(lblEspecialidad);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setEditable(false);
		txtEspecialidad.setBounds(150, 120, 300, 20);
		panelDatos.add(txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
		// CMP
		JLabel lblCmp = new JLabel("CMP:");
		lblCmp.setBounds(270, 15, 50, 20);
		panelDatos.add(lblCmp);
		
		txtCmp = new JTextField();
		txtCmp.setEditable(false);
		txtCmp.setBounds(330, 15, 120, 20);
		panelDatos.add(txtCmp);
		txtCmp.setColumns(10);
		
		// Estado
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(30, 155, 120, 20);
		panelDatos.add(lblEstado);
		
		cmbEstado = new JComboBox<String>();
		cmbEstado.setEnabled(false);
		cmbEstado.setModel(new DefaultComboBoxModel<String>(new String[] {"Activo", "Inactivo"}));
		cmbEstado.setBounds(150, 155, 120, 22);
		panelDatos.add(cmbEstado);
		
		// Botón Limpiar
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(GUIConsultarMedico.class.getResource("/img/informe-medico.png")));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
			}
		});
		btnLimpiar.setBounds(480, 140, 130, 30);
		panelDatos.add(btnLimpiar);
		
		// Tabla de médicos
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 305, 645, 240);
		contentPane.add(scrollPane);
		
		tblMedicos = new JTable();
		modeloTabla = new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"Código", "Nombres", "Apellidos", "Especialidad", "CMP", "Estado"
			}
		) {
			// Hacer que la tabla no sea editable
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tblMedicos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nombres", "Apellidos", "Especialidad", "CMP", "Estado"
			}
		));
		
		// Evento de selección en la tabla
		tblMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				int fila = tblMedicos.getSelectedRow();
				if (fila >= 0) {
					cargarDatosDesdeTabla(fila);
				}
			}
		});
		
		scrollPane.setViewportView(tblMedicos);
		
		// Cargar datos de ejemplo al iniciar
		cargarDatosEjemplo();
	}
	
	/**
	 * Busca médicos según el criterio seleccionado
	 */
	private void buscarMedico() {
		String criterio = (String) cmbBuscarPor.getSelectedItem();
		String valorBusqueda = txtBuscar.getText().trim();
		
		if (valorBusqueda.isEmpty()) {
			JOptionPane.showMessageDialog(this, 
				"Por favor ingrese un valor de búsqueda", 
				"Campo requerido", 
				JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		// Aquí se implementaría la búsqueda real en la base de datos
		// Por ahora se muestra un mensaje
		limpiarTabla();
		
		// Simulación de búsqueda - en producción se buscaría en la BD
		boolean encontrado = false;
		for (int i = 0; i < modeloTabla.getRowCount(); i++) {
			// Lógica de búsqueda simulada
		}
		
		if (!encontrado) {
			JOptionPane.showMessageDialog(this, 
				"No se encontraron médicos con el criterio: " + criterio + " = " + valorBusqueda, 
				"Sin resultados", 
				JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	/**
	 * Carga todos los médicos en la tabla
	 */
	private void cargarTodosLosMedicos() {
		limpiarTabla();
		cargarDatosEjemplo();
		JOptionPane.showMessageDialog(this, 
			"Se cargaron todos los médicos registrados", 
			"Información", 
			JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Carga los datos de una fila seleccionada de la tabla a los campos
	 */
	private void cargarDatosDesdeTabla(int fila) {
		try {
			txtCodigo.setText(modeloTabla.getValueAt(fila, 0).toString());
			txtNombres.setText(modeloTabla.getValueAt(fila, 1).toString());
			txtApellidos.setText(modeloTabla.getValueAt(fila, 2).toString());
			txtEspecialidad.setText(modeloTabla.getValueAt(fila, 3).toString());
			txtCmp.setText(modeloTabla.getValueAt(fila, 4).toString());
			
			String estado = modeloTabla.getValueAt(fila, 5).toString();
			cmbEstado.setSelectedIndex(estado.equals("Activo") ? 0 : 1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, 
				"Error al cargar datos: " + e.getMessage(), 
				"Error", 
				JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Limpia todos los campos del formulario
	 */
	private void limpiarCampos() {
		txtCodigo.setText("");
		txtNombres.setText("");
		txtApellidos.setText("");
		txtEspecialidad.setText("");
		txtCmp.setText("");
		cmbEstado.setSelectedIndex(0);
		txtBuscar.setText("");
		tblMedicos.clearSelection();
	}
	
	/**
	 * Limpia la tabla
	 */
	private void limpiarTabla() {
		while (modeloTabla.getRowCount() > 0) {
			modeloTabla.removeRow(0);
		}
	}
	
	/**
	 * Carga datos de ejemplo en la tabla (simulación)
	 * En producción, esto cargaría datos desde la base de datos
	 */
	private void cargarDatosEjemplo() {
		limpiarTabla();
		
		// Datos de ejemplo - En producción vendrían de la base de datos
		Object[][] datos = {
			{1001, "Carlos", "García López", "Cardiología", "CMP-12345", "Activo"},
			{1002, "María", "Rodríguez Silva", "Pediatría", "CMP-23456", "Activo"},
			{1003, "José", "Martínez Pérez", "Dermatología", "CMP-34567", "Activo"},
			{1004, "Ana", "López González", "Ginecología", "CMP-45678", "Inactivo"},
			{1005, "Pedro", "Sánchez Torres", "Traumatología", "CMP-56789", "Activo"},
			{1006, "Laura", "Fernández Cruz", "Neurología", "CMP-67890", "Activo"},
			{1007, "Miguel", "Ramírez Vega", "Oftalmología", "CMP-78901", "Activo"},
			{1008, "Carmen", "Torres Díaz", "Psiquiatría", "CMP-89012", "Inactivo"}
		};
		
		for (Object[] fila : datos) {
			modeloTabla.addRow(fila);
		}
	}
	
	/**
	 * Agrega un médico a la tabla
	 */
	public void agregarMedicoATabla(Medico medico) {
		Object[] fila = {
			medico.getCodMedico(),
			medico.getNombres(),
			medico.getApellidos(),
			medico.getEspecialidad(),
			medico.getCmp(),
			medico.getEstado() == 0 ? "Activo" : "Inactivo"
		};
		modeloTabla.addRow(fila);
	}
}
