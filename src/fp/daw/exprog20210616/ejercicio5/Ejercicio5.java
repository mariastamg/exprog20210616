package fp.daw.exprog20210616.ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Ejercicio5 extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 marco = new Ejercicio5();
					marco.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	public Ejercicio5() {
		setTitle("Examen Final-Ejercicio5");
		setVisible(true);
		JPanel panel = (JPanel) getContentPane();
		panel.setLayout(new BorderLayout());
		//barra de menu
		JMenuBar barra = new JMenuBar();
		JMenu menu = new JMenu("Archivo"); 
		JMenuItem opcionAbrir = new JMenuItem("Abrir");
		menu.add(opcionAbrir);
		barra.add(menu); 
		setJMenuBar(barra);
		
		
		pack();
		setLocationRelativeTo(null);
	}

	}


