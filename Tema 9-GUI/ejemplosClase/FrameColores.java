package ejemplosClase;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

public class FrameColores {

	public static void main(String[] args) {

		//SwingUtilities.invokeLater(new Runnable() {public void run(){montaVentana();}});
		SwingUtilities.invokeLater(() -> montaVentana());

	}
	
	public static void montaVentana() {	
		
		JFrame marco = new JFrame("El marco de colorines");
		JButton boton = new JButton("Cambiar color");
		
		boton.addActionListener((ae)->marco.getContentPane().setBackground(new Color(byteRandom(), byteRandom(),byteRandom())));
		
		marco.add(boton, BorderLayout.SOUTH);
		
		marco.setSize(300,200);
		marco.setLocationRelativeTo(null); //Esto hace que aparezca centrado en lugar de en la esquina
		marco.setVisible(true);
	}
	
	public static int byteRandom() {
		
		return (int)(Math.random()*255);
	}

}
