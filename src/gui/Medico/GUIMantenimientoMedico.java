package gui.Medico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
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

public class GUIMantenimientoMedico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBuscar;
	private JTextField txtCodigo;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtEspecialidad;
	private JTextField txtCmp;
	private JComboBox<String> cmbEstado;
	private JTable tblMedicos;
	private DefaultTableModel modeloTabla;
	private JComboBox<String> cmbBuscarPor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMantenimientoMedico frame = new GUIMantenimientoMedico();
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
	public GUIMantenimientoMedico() {
		setTitle("Consultar Médico");
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
		panelBusqueda.setBorder(new TitledBorder(null, "Buscar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelBusqueda.setBounds(20, 45, 645, 70);
		contentPane.add(panelBusqueda);
		panelBusqueda.setLayout(null);
		
		JLabel lblBuscarPor = new JLabel("Buscar por:");
		lblBuscarPor.setBounds(20, 25, 80, 20);
		panelBusqueda.add(lblBuscarPor);
		
		cmbBuscarPor = new JComboBox<String>();
		cmbBuscarPor.setModel(new DefaultComboBoxModel(new String[] {"Código", "CMP"}));
		cmbBuscarPor.setBounds(110, 25, 130, 22);
		panelBusqueda.add(cmbBuscarPor);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(250, 25, 250, 22);
		txtBuscar.setText("");
		panelBusqueda.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(GUIMantenimientoMedico.class.getResource("/img/paciente.png")));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// buscar
			}
		});
		btnBuscar.setBounds(510, 23, 120, 25);
		panelBusqueda.add(btnBuscar);
		
		// Panel de datos del médico
		JPanel panelDatos = new JPanel();
		panelDatos.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDatos.setBounds(20, 125, 645, 180);
		contentPane.add(panelDatos);
		panelDatos.setLayout(null);
		
		// Código Médico
		JLabel lblCodigo = new JLabel("Código Médico:");
		lblCodigo.setBounds(30, 25, 120, 20);
		panelDatos.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(150, 25, 100, 20);
		panelDatos.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		// Nombres
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(30, 60, 120, 20);
		panelDatos.add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setEditable(false);
		txtNombres.setBounds(150, 60, 480, 20);
		panelDatos.add(txtNombres);
		txtNombres.setColumns(10);
		
		// Apellidos
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(30, 95, 120, 20);
		panelDatos.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setBounds(150, 95, 480, 20);
		panelDatos.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		// Especialidad
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setBounds(30, 130, 120, 20);
		panelDatos.add(lblEspecialidad);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setEditable(false);
		txtEspecialidad.setBounds(150, 130, 480, 20);
		panelDatos.add(txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
		// CMP
		JLabel lblCmp = new JLabel("CMP:");
		lblCmp.setBounds(270, 25, 50, 20);
		panelDatos.add(lblCmp);
		
		txtCmp = new JTextField();
		txtCmp.setEditable(false);
		txtCmp.setBounds(330, 25, 120, 20);
		panelDatos.add(txtCmp);
		txtCmp.setColumns(10);
		
		// Estado
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(470, 25, 60, 20);
		panelDatos.add(lblEstado);
		
		cmbEstado = new JComboBox<String>();
		cmbEstado.setEnabled(false);
		cmbEstado.setModel(new DefaultComboBoxModel<String>(new String[] {"Activo", "Inactivo"}));
		cmbEstado.setBounds(530, 25, 100, 22);
		panelDatos.add(cmbEstado);
		
		// Panel de opciones de botones
		JPanel panelOpciones = new JPanel();
		panelOpciones.setBorder(new TitledBorder(null, "Opciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelOpciones.setBounds(20, 316, 645, 80);
		contentPane.add(panelOpciones);
		panelOpciones.setLayout(null);
		
		// Botón Consultar
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon(GUIMantenimientoMedico.class.getResource("/img/paciente.png")));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// eliminar medico
			}
		});
		btnConsultar.setBounds(30, 30, 140, 30);
		panelOpciones.add(btnConsultar);
		
		// Botón Modificar
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(GUIMantenimientoMedico.class.getResource("/img/informe-medico.png")));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// modificar medico
			}
		});
		btnModificar.setBounds(190, 30, 140, 30);
		panelOpciones.add(btnModificar);
		
		// Botón Eliminar
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(GUIMantenimientoMedico.class.getResource("/img/informe-medico.png")));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// eliminar medico
			}
		});
		btnEliminar.setBounds(350, 30, 140, 30);
		panelOpciones.add(btnEliminar);
		
		// Botón Limpiar
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(GUIMantenimientoMedico.class.getResource("/img/informe-medico.png")));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
			}
		});
		btnLimpiar.setBounds(510, 30, 120, 30);
		panelOpciones.add(btnLimpiar);
		
		// Tabla de médicos
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 405, 645, 140);
		contentPane.add(scrollPane);
		
		tblMedicos = new JTable();
		modeloTabla = new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"Código", "Nombres", "Apellidos", "Especialidad", "CMP", "Estado"
			}
		) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tblMedicos.setModel(modeloTabla);
		scrollPane.setViewportView(tblMedicos);
		cargarDatosEjemplo();
	}
	
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
	

	private void limpiarTabla() {
		while (modeloTabla.getRowCount() > 0) {
			modeloTabla.removeRow(0);
		}
	}

	private void cargarDatosEjemplo() {
		Object[][] datos = {
			{1001, "Roger", "Rojas", "Cardiología", "CMP-12345", "Activo"},
			{1002, "Juan", "Perez", "Pediatría", "CMP-23456", "Activo"}
		};
		
		for (Object[] fila : datos) {
			modeloTabla.addRow(fila);
		}
	}
}
