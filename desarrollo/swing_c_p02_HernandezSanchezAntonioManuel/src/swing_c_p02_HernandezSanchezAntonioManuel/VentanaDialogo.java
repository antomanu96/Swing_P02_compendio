/**
 * VentanaDialogo.java
  28-nov-2021 20:57:03
  @author Antonio Manuel Hernandez Sanchez
 */
package swing_c_p02_HernandezSanchezAntonioManuel;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


/**
 * The Class VentanaDialogo.
 */
public class VentanaDialogo extends JFrame implements ActionListener  {

	/**
	 * Instantiates a new ventana dialogo.
	 */
	public VentanaDialogo() {
		super("Alta Piso");
		//operacion por defecto
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * Para que la ventana nos salga en tamaño completo
		 */
		Toolkit miPantalla= Toolkit.getDefaultToolkit();
		
		Dimension tamagnoPantalla=miPantalla.getScreenSize();
		
		int altoPantalla=tamagnoPantalla.height;
		int anchoPantalla=tamagnoPantalla.width;
		
		this.setSize(anchoPantalla, altoPantalla);
		
		this.setLocation(anchoPantalla, altoPantalla);
		
		Image miIcono=miPantalla.getImage("src/recursos/logoHotel.jpg");
		this.setIconImage(miIcono);
		
		
		this.setVisible(true);
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
