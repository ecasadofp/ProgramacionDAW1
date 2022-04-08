package ejemplosClase;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {

	private static void creaYMuestraGUI() {

		JFrame marco = new JFrame("Hola mundo");

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel etiqueta = new JLabel("Hola mundo");

		marco.getContentPane().add(etiqueta);

		marco.pack();
		
		marco.setVisible(true);

	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			public void run(){

				creaYMuestraGUI();
				
			}
		});
	}
}
