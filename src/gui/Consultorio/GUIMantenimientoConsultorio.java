package gui.Consultorio;

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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import clases.Consultorio;

public class GUIMantenimientoConsultorio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtUbicacion;
	private JSpinner spnPiso;
	private JSpinner spnCapacidad;
	private JComboBox<String> cmbEstado;
	private JTable tblConsultorios;
	private DefaultTableModel modeloTabla;
	private JTextField txtBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMantenimientoConsultorio frame = new GUIMantenimientoConsultorio();
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
	public GUIMantenimientoConsultorio() {
		setTitle("Consultar Consultorio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Título
		JLabel lblTitulo = new JLabel("CONSULTA DE CONSULTORIOS");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(210, 11, 280, 25);
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
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(110, 24, 250, 22);
		panelBusqueda.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(GUIMantenimientoConsultorio.class.getResource("/img/paciente.png")));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// buscar consultorio
			}
		});
		btnBuscar.setBounds(370, 23, 120, 25);
		panelBusqueda.add(btnBuscar);
		
		// Panel de datos del consultorio
		JPanel panelDatos = new JPanel();
		panelDatos.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDatos.setBounds(20, 125, 645, 180);
		contentPane.add(panelDatos);
		panelDatos.setLayout(null);
		
		// Código Consultorio
		JLabel lblCodigo = new JLabel("Código Consultorio:");
		lblCodigo.setBounds(30, 25, 140, 20);
		panelDatos.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(170, 25, 100, 20);
		panelDatos.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		// Nombre
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 60, 140, 20);
		panelDatos.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setBounds(170, 60, 300, 20);
		panelDatos.add(txtNombre);
		txtNombre.setColumns(10);
		
		// Piso
		JLabel lblPiso = new JLabel("Piso:");
		lblPiso.setBounds(30, 95, 140, 20);
		panelDatos.add(lblPiso);
		
		spnPiso = new JSpinner();
		spnPiso.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		spnPiso.setEnabled(false);
		spnPiso.setBounds(170, 95, 100, 20);
		panelDatos.add(spnPiso);
		
		// Ubicación
		JLabel lblUbicacion = new JLabel("Ubicación:");
		lblUbicacion.setBounds(30, 130, 140, 20);
		panelDatos.add(lblUbicacion);
		
		txtUbicacion = new JTextField();
		txtUbicacion.setEditable(false);
		txtUbicacion.setBounds(170, 130, 300, 20);
		panelDatos.add(txtUbicacion);
		txtUbicacion.setColumns(10);
		
		// Capacidad
		JLabel lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setBounds(290, 95, 80, 20);
		panelDatos.add(lblCapacidad);
		
		spnCapacidad = new JSpinner();
		spnCapacidad.setModel(new SpinnerNumberModel(1, 1, 50, 1));
		spnCapacidad.setEnabled(false);
		spnCapacidad.setBounds(370, 95, 70, 20);
		panelDatos.add(spnCapacidad);
		
		JLabel lblPersonas = new JLabel("personas");
		lblPersonas.setBounds(450, 95, 80, 20);
		panelDatos.add(lblPersonas);
		
		// Estado
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(290, 25, 80, 20);
		panelDatos.add(lblEstado);
		
		cmbEstado = new JComboBox<String>();
		cmbEstado.setEnabled(false);
		cmbEstado.setModel(new DefaultComboBoxModel<String>(new String[] {"Activo", "Inactivo"}));
		cmbEstado.setBounds(370, 25, 100, 22);
		panelDatos.add(cmbEstado);
		
		// Panel de opciones de botones
		JPanel panelOpciones = new JPanel();
		panelOpciones.setBorder(new TitledBorder(null, "Opciones de Botones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelOpciones.setBounds(20, 315, 645, 80);
		contentPane.add(panelOpciones);
		panelOpciones.setLayout(null);
		
		// Botón Consultar
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon(GUIMantenimientoConsultorio.class.getResource("/img/paciente.png")));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// consultar
			}
		});
		btnConsultar.setBounds(30, 30, 140, 30);
		panelOpciones.add(btnConsultar);
		
		// Botón Modificar
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(GUIMantenimientoConsultorio.class.getResource("/img/informe-medico.png")));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// modificar consultorio
			}
		});
		btnModificar.setBounds(190, 30, 140, 30);
		panelOpciones.add(btnModificar);
		
		// Botón Eliminar
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(GUIMantenimientoConsultorio.class.getResource("/img/informe-medico.png")));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// eliminar consultorio
			}
		});
		btnEliminar.setBounds(350, 30, 140, 30);
		panelOpciones.add(btnEliminar);
		
		// Botón Limpiar
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(GUIMantenimientoConsultorio.class.getResource("/img/informe-medico.png")));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
			}
		});
		btnLimpiar.setBounds(510, 30, 120, 30);
		panelOpciones.add(btnLimpiar);
		
		// Tabla de consultorios
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 405, 645, 140);
		contentPane.add(scrollPane);
		
		tblConsultorios = new JTable();
		modeloTabla = new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"Código", "Nombre", "Piso", "Ubicación", "Capacidad", "Estado"
			}
		) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tblConsultorios.setModel(modeloTabla);
		scrollPane.setViewportView(tblConsultorios);
		
		cargarDatosEjemplo();
	}

	private void limpiarCampos() {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtUbicacion.setText("");
		spnPiso.setValue(1);
		spnCapacidad.setValue(1);
		cmbEstado.setSelectedIndex(0);
		txtBuscar.setText("");
		tblConsultorios.clearSelection();
		
		// Deshabilitar edición
		txtNombre.setEditable(false);
		txtUbicacion.setEditable(false);
		spnPiso.setEnabled(false);
		spnCapacidad.setEnabled(false);
		cmbEstado.setEnabled(false);
	}
	
	private void limpiarTabla() {
		while (modeloTabla.getRowCount() > 0) {
			modeloTabla.removeRow(0);
		}
	}
	

	private void cargarDatosEjemplo() {
		limpiarTabla();
		
		// Datos de ejemplo - En producción vendrían de la base de datos
		Object[][] datos = {
			{101, "Consultorio A", 1, "Ala Norte", 5, "Activo"},
			{103, "Consultorio C", 2, "Ala Norte", 6, "Activo"},
			{105, "Consultorio E", 3, "Ala Este", 8, "Activo"}
		};
		
		for (Object[] fila : datos) {
			modeloTabla.addRow(fila);
		}
	}
}
