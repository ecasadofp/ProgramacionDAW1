package ejemplos;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BotonLoco {
	static int xBtn = 190;
	static int yBtn = 100;
	JButton btnOtro;

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> new BotonLoco());

	}

	public BotonLoco() {

		JFrame marco = new JFrame("Elige con total libertad");

		marco.setLayout(null);

		JLabel texto = new JLabel("Elige tu lenguaje de programación favorito");

		JButton btnJava = new JButton("Java");
		btnOtro = new JButton("Otro");

		btnOtro.addMouseListener(new escuchaBoton());
		btnJava.addActionListener((ae) -> {
			marco.dispose();
			JOptionPane.showMessageDialog(null, "Buena elección");});

		texto.setBounds(20, 20, 350, 20);
		btnJava.setBounds(70, 100, 100, 20);
		btnOtro.setBounds(xBtn, yBtn, 100, 20);

		marco.add(texto);
		marco.add(btnJava);
		marco.add(btnOtro);
		
		marco.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		marco.setLocationRelativeTo(null);
		marco.setSize(360, 200);
		marco.setVisible(true);
	}

	class escuchaBoton implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			int deltaY = (int) (Math.random() * 10 + 20);
			if (Math.random() < 0.5)
				deltaY *= -1;
			xBtn += (int) (Math.random() * 50 - 25);
			yBtn += deltaY;

			if (yBtn > 170 || yBtn < 0)
				yBtn = 100;
			btnOtro.setBounds(xBtn, yBtn, 100, 20);

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

	}
}
