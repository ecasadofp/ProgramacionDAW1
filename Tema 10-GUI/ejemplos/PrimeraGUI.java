package ejemplos;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrimeraGUI {

	public static void main(String[] args) {

		JFrame marco = new JFrame("Primera ventana");
		JLabel etiqueta = new JLabel("El apasionante mundo de las GUI");
		
		marco.add(etiqueta);
		marco.setSize(300,100);
		//marco.pack(); //Ajusta la ventana al contenido
		marco.setVisible(true);

	}
}
