package ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing08 extends JFrame {
	JButton boton1;
	JLabel label1;
	int contador;
	Container panel;

	public Swing08() {
		boton1 = new JButton("PULSA");
		label1 = new JLabel("Pulsaciones: 0");
		panel = getContentPane();
		panel.add(boton1);
		panel.add(label1);
		panel.setLayout(new FlowLayout());
		boton1.addActionListener(new OyenteBotonPulsaciones());

		setSize(300, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Swing08 ventana = new Swing08();
	}

	class OyenteBotonPulsaciones implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			contador++;
			label1.setText("Pulsaciones: " + contador);
		}
	}
}
