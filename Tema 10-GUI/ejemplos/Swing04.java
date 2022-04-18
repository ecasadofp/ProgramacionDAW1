package ejemplos;

import javax.swing.*;
import java.awt.*;

public class Swing04 extends JFrame {
	Container panel;

	public Swing04() {
		super("Ejemplo de Layout");
		// Configurar componentes:
		panel = this.getContentPane();
		// GridLayout
		panel.setLayout(new GridLayout(4, 3, 5, 5));
		// Add buttons to the frame
		for (int i = 1; i <= 10; i++)
			panel.add(new JButton(Integer.toString(i)));
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Swing04 ventana = new Swing04();
	}
}
