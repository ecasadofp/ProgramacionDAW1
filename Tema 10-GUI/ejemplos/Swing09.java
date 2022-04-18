package ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing09 extends JFrame {
	JButton red = new JButton("Rojo");
	JButton blue = new JButton("Azul");
	Container panel;

	public Swing09() {
		super("Color de fondo");
		panel = getContentPane();
		panel.setLayout(new FlowLayout());
		panel.add(red);
		panel.add(blue);
		red.addActionListener(new ColorActionListener(Color.red));
		blue.addActionListener(new ColorActionListener(Color.blue));
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Swing09 ventana = new Swing09();
	}

	class ColorActionListener implements ActionListener {
		Color fondo;

		public ColorActionListener(Color unColor) {
			fondo = unColor;
		}

		public void actionPerformed(ActionEvent evento) {
			panel.setBackground(fondo);
		}
	}
}
