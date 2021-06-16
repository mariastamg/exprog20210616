package fp.daw.exprog20210616.ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ejercicio5 extends JFrame implements ActionListener{
	
	private static JMenuItem opcionAbrir;
	private static JFileChooser elegir;
	private Queue<Integer> q = new LinkedList<Integer>();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		super("Examen Final-Ejercicio5");
		setTitle("Examen Final-Ejercicio5");
		setVisible(true);
		setBounds(100,100, 800, 500);
		JPanel panel = (JPanel) getContentPane();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		
		//MENU
		JMenuBar barra = new JMenuBar();
		JMenu menu = new JMenu("Archivo"); 
		menu.setMnemonic(KeyEvent.VK_M);
		opcionAbrir = new JMenuItem("Abrir");
		opcionAbrir.setMnemonic(KeyEvent.VK_A);
		menu.add(opcionAbrir);
		barra.add(menu); 
		setJMenuBar(barra);
		opcionAbrir.addActionListener(this);
		
		
		//PANEL
		JPanel panelCentral = (JPanel) getContentPane();
		Rectangle r=new Rectangle(900,600);
		panelCentral.setBounds(r);
		
		//BOTON
		JButton btnIntercalar=new JButton("Intercalar");
		btnIntercalar.setMnemonic(KeyEvent.VK_I);
		
		
		panel.add(barra,BorderLayout.NORTH);
		//panel.add(panelCentral,BorderLayout.CENTER);
		panel.add(btnIntercalar,BorderLayout.SOUTH);
		//pack();
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		elegir=new JFileChooser();
		int seleccion=elegir.showSaveDialog(opcionAbrir);
		if (seleccion == JFileChooser.APPROVE_OPTION)
		{
			File fichero= elegir.getSelectedFile();
			try {
				FileInputStream fc=new FileInputStream(fichero);
				DataInputStream dt=new DataInputStream(fc);
				while (true) {   
	                int n = dt.readInt();  
	                q.offer(n);
	                
				}
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

	}


