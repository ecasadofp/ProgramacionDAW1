package ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing07_2 extends JFrame {
	Container panel;
	JButton botonCopiar;
	JTextField campoValor, resultado;
	JLabel etiqueta1, etiqueta2;

	public Swing07_2() {
		panel = getContentPane();
		panel.setLayout((null));
		etiqueta1 = new JLabel("Valor");
		etiqueta2 = new JLabel("Copia");
		etiqueta1.setBounds(10, 20, 60, 20);
		panel.add(etiqueta1);
		etiqueta2.setBounds(10, 50, 60, 20);
		campoValor = new JTextField(5);
		campoValor.setBounds(50, 20, 60, 20);
		panel.add(campoValor);
		panel.add(etiqueta2);
		resultado = new JTextField(5);
		resultado.setBounds(50, 50, 60, 20);
		panel.add(resultado);
		botonCopiar = new JButton("Copiar");
		botonCopiar.setBounds(40, 90, 85, 20);
		panel.add(botonCopiar);
		botonCopiar.addActionListener(new OyenteBoton());
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Swing07_2 ventana = new Swing07_2();
	}

	class OyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String valor = campoValor.getText();
			resultado.setText(valor);
		}
	}
}
