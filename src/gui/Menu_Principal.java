package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu_Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Principal frame = new Menu_Principal();
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
	public Menu_Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu_Principal.class.getResource("/img/cita-medica.png")));
		setTitle("Reserva de CItas Medicas");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		//pantalla maximizada
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Mantenimiento = new JMenu("Mantenimiento");
		Mantenimiento.setIcon(new ImageIcon(Menu_Principal.class.getResource("/img/paciente.png")));
		Mantenimiento.setSelectedIcon(new ImageIcon(Menu_Principal.class.getResource("/img/estetoscopio.png")));
		menuBar.add(Mantenimiento);
		
		JMenu MPaciente = new JMenu("Paciente");
		MPaciente.setSelectedIcon(new ImageIcon(Menu_Principal.class.getResource("/img/paciente.png")));
		Mantenimiento.add(MPaciente);
		
		JMenuItem SMPacienteAdicionar = new JMenuItem("Adicionar");
		SMPacienteAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//boton adicionar paciente
				GUIPaciente pac =new GUIPaciente();
				
				pac.setLocationRelativeTo(Menu_Principal.this);
				pac.setVisible(true);
					
				
			}
		});
		MPaciente.add(SMPacienteAdicionar);
		
		JMenuItem SMPacienteConModEli = new JMenuItem("Consultar, Modificar, Eliminar");
		SMPacienteConModEli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Que aparezca la ventana consultar modificar eliminar  gaaaaa :v
				
				GUIPacienteConModEli paccme =new GUIPacienteConModEli();
				
				paccme.setLocationRelativeTo(Menu_Principal.this);
				paccme.setVisible(true);
				
				
				
			}
		});
		MPaciente.add(SMPacienteConModEli);
		
		JMenu MMedico = new JMenu("Medico");
		Mantenimiento.add(MMedico);
		
		JMenuItem SMMedicoAdicionar = new JMenuItem("Adicionar");
		MMedico.add(SMMedicoAdicionar);
		
		JMenuItem SMMedicoConModEli = new JMenuItem("Consultar, Modificar, Eliminar");
		MMedico.add(SMMedicoConModEli);
		
		JMenu MConsultorio = new JMenu("Consultorio");
		Mantenimiento.add(MConsultorio);
		
		JMenuItem SMConsultorioAdicionar = new JMenuItem("Adicionar");
		MConsultorio.add(SMConsultorioAdicionar);
		
		JMenuItem SMConsultorioConModEli = new JMenuItem("Consultar, Modificar, Eliminar");
		MConsultorio.add(SMConsultorioConModEli);
		
		JMenu Registro = new JMenu("Registro Citas");
		Registro.setIcon(new ImageIcon(Menu_Principal.class.getResource("/img/equipo-medico.png")));
		Registro.setSelectedIcon(new ImageIcon(Menu_Principal.class.getResource("/img/doctor.png")));
		menuBar.add(Registro);
		
		JMenuItem MRegistroAdicionar = new JMenuItem("Adicionar");
		Registro.add(MRegistroAdicionar);
		
		JMenuItem MRegistroConModEli = new JMenuItem("Consultar, Modificar, Eliminar");
		Registro.add(MRegistroConModEli);
		
		JMenu Consulta = new JMenu("Consulta");
		Consulta.setIcon(new ImageIcon(Menu_Principal.class.getResource("/img/estetoscopio.png")));
		menuBar.add(Consulta);
		
		JMenuItem MConsultaPaciente = new JMenuItem("Por Paciente");
		Consulta.add(MConsultaPaciente);
		
		JMenuItem MConsultaMedico = new JMenuItem("Por Médico");
		Consulta.add(MConsultaMedico);
		
		JMenuItem MConsultaConsultorio = new JMenuItem("Por Consultorio");
		Consulta.add(MConsultaConsultorio);
		
		JMenuItem MConsultaFecha = new JMenuItem("Por Fecha");
		Consulta.add(MConsultaFecha);
		
		JMenu Reporte = new JMenu("Reporte");
		Reporte.setIcon(new ImageIcon(Menu_Principal.class.getResource("/img/informe-medico.png")));
		menuBar.add(Reporte);
		
		JMenuItem MReportePaciente = new JMenuItem("Por Paciente");
		Reporte.add(MReportePaciente);
		
		JMenuItem MReporteMedico = new JMenuItem("Por Médico");
		Reporte.add(MReporteMedico);
		
		JMenuItem MReporteConsultorio = new JMenuItem("Por Consultorio");
		Reporte.add(MReporteConsultorio);
		
		JMenuItem MReporteFecha = new JMenuItem("Por Fecha");
		Reporte.add(MReporteFecha);
		
		JMenu Ayuda = new JMenu("Ayuda");
		Ayuda.setIcon(new ImageIcon(Menu_Principal.class.getResource("/img/cita-medica.png")));
		menuBar.add(Ayuda);
		
		JMenuItem MAcerca = new JMenuItem("Acerca de");
		Ayuda.add(MAcerca);
		
		JMenuItem MSalir = new JMenuItem("Salir");
		MSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//mostrar ventana emergente.
				int op=JOptionPane.showConfirmDialog(
						Menu_Principal.this, 
						"Desea Salir?", 
						"Confirmar", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.QUESTION_MESSAGE);
				if(op==JOptionPane.YES_OPTION) { 
					System.exit(0);
					
					
				}
			}
		});
		Ayuda.add(MSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	}

}
