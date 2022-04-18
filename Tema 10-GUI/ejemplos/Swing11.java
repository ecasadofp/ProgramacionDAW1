package ejemplos;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing11 extends JFrame implements ActionListener {
	JButton boton1;
	JButton boton2;
	JLabel etiqueta;

	public Swing11() {
		getContentPane().setLayout(new GridLayout(2, 1));

		// contenedor para botones
		JPanel panelBotones = new JPanel(new FlowLayout());
		boton1 = new JButton("Elegir 1");
		boton2 = new JButton("Elegir 2");
		panelBotones.add(boton1);
		panelBotones.add(boton2);

		boton1.addActionListener(this);
		boton2.addActionListener(this);

		etiqueta = new JLabel("No has elegido nada");
		getContentPane().add(panelBotones);
		getContentPane().add(etiqueta);

		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			etiqueta.setText("Has elegido la opción 1");
		} else {
			etiqueta.setText("Has elegido la opción 2");
		}

	}

	public static void main(String[] args) {
		Swing11 ventana = new Swing11();

	}

}
