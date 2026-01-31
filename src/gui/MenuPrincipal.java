package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuPrincipal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		setTitle("Reserva de Citas Médicas - Menú Principal");
		setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JMenuBar menuPrincipal = new JMenuBar();
        JMenu mnMantenimiento = new JMenu("Mantenimiento");
        JMenu mnRegistro = new JMenu("Reserva");
        JMenu mnConsulta = new JMenu("Consulta");
        JMenu mnReporte = new JMenu("Reporte");
        JMenu mnAyuda = new JMenu("Ayuda");
        
        JMenuItem itemPaciente = new JMenuItem("Paciente");
        JMenuItem itemMedico = new JMenuItem("Medico");
        JMenuItem itemConsultorio = new JMenuItem("Consultorio");
        
        mnMantenimiento.add(itemPaciente);
        mnMantenimiento.add(itemMedico);
        mnMantenimiento.add(itemConsultorio);

        menuPrincipal.add(mnMantenimiento);
        menuPrincipal.add(mnRegistro);
        menuPrincipal.add(mnConsulta);
        menuPrincipal.add(mnReporte);
        menuPrincipal.add(mnAyuda);

        setJMenuBar(menuPrincipal);
	}

}
