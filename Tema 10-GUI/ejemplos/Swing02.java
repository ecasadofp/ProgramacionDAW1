package ejemplos;

import javax.swing.*;
import java.awt.*;

public class Swing02 extends JFrame {

	Container panel;

	public Swing02() {
		super("Ejemplo de Layout");
		// Configurar componentes ;
		panel = this.getContentPane();
		// Configurar layout ;
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		for (int i = 1; i <= 10; i++)
			panel.add(new JButton("Componente " + i));
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Swing02 ventana = new Swing02();
	}
}
