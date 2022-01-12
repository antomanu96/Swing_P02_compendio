/**
 * VentanaPrincipal.java
  28-nov-2021 11:12:22
  @author Antonio Manuel Hernandez Sanchez
 */
package swing_c_p02_HernandezSanchezAntonioManuel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.glass.events.KeyEvent;

public class VentanaPrincipal extends JFrame implements ActionListener {

	/** The mi barra. */
	
	private JMenuBar miBarra;
	private JMenu archivo,registro,ayuda;
	private JMenuItem salir,altaPiso,bajaPiso,acercaDe;
	private JPanel miPanel;
	
	private void inicializarComponentes() {
		
		/**
		 * Creamos la barra
		 */
		miBarra=new JMenuBar();
		
		/**
		 * Creamos las opcines de la barra
		 */
		archivo=new JMenu("Archivo");
		registro=new JMenu("Registro");
		ayuda= new JMenu("Ayuda");
		
		salir=new JMenuItem("Salir");
		salir.addActionListener(this);
		
		altaPiso=new JMenuItem("Alta Piso");
		altaPiso.addActionListener(this);
		
		bajaPiso=new JMenuItem("Baja Piso");
		bajaPiso.addActionListener(this);
		
		acercaDe=new JMenuItem("Acerca de...");
		acercaDe.addActionListener(this);
		
		/**
		 * Añadimos opciones a nuestra barra
		 */
		archivo.add(salir);
		registro.add(altaPiso);
		registro.add(bajaPiso);
		ayuda.add(acercaDe);
		
		miBarra.add(archivo);
		miBarra.add(registro);
		miBarra.add(ayuda);
		
		this.setJMenuBar(miBarra);
		
		miPanel = new JPanel();
		miPanel.setLayout(null);
		
		
		/**
		 * Añadimos la barra a nuestra ventana
		 */
		this.add(miPanel);
		
		this.setVisible(true); 		    
	
	}
	
	public VentanaPrincipal() {
		super("Gestion Apartamentos Turistivos 'W HOTELS'");
		//operacion por defecto
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * Para poner el icono de la ventana la imagen que queremos
		 * y que nos aparezca la ventana centrada
		 */
		Toolkit miPantalla= Toolkit.getDefaultToolkit();
		
		Dimension tamagnoPantalla=miPantalla.getScreenSize();
		
		int altoPantalla=tamagnoPantalla.height;
		int anchoPantalla=tamagnoPantalla.width;
		
		this.setSize(anchoPantalla/2, altoPantalla/2);
		
		this.setLocation(anchoPantalla/4, altoPantalla/4);
		
		Image miIcono=miPantalla.getImage("src/recursos/logoHotel.jpg");
		this.setIconImage(miIcono);
		
		this.inicializarComponentes();
		this.setVisible(true);
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
	
		/**
		 * Me cierra el programa 
		 */
		if(e.getSource()==salir) {
			System.exit(0);
		}
		
		/**
		 * Nos saldra una ventana emergente que nos indicara que esta opcion no se encuentra implementada 
		 */
		if(e.getSource()==bajaPiso) {
			JFrame jFrame = new JFrame();
			JOptionPane.showMessageDialog(jFrame, "Esta opcion no esta implantada");
		}
		
		/**
		 * Nos abrira la ventanaDialogo
		 */
		if(e.getSource()==altaPiso) {
			VentanaDialogo ventanaDialogo =new VentanaDialogo();
		}
		
		/**
		 * Nos mostrara una ventana emergente que nos indicara en que consiste nuestra aplicacion
		 */
		if(e.getSource()==acercaDe) {
			JFrame jFrame = new JFrame();
			JOptionPane.showMessageDialog(jFrame, "Esta aplicacion pertenece a la cadena hotelera W Hotels "
	        		+ "\n La utilizadad de esta aplicacion consistira en gestion hotelera basica "
	        		+ "\n Creada por Antonio Manuel Hernandez Sanchez");
		}
		
		
	}

}
