package ejemplosClase;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EjemploBoton {
	
	public static void main(String[] args) {
		
		
		JFrame marco= new JFrame("El marco");
		marco.setBounds(800,400,300,100);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setLayout(new FlowLayout());
		marco.setVisible(true);
		
		JButton boton1 = new JButton("Pínchame!");
		JButton boton2 = new JButton("No, a mi!");

		boton1.addActionListener(new Escuchador());
		boton2.addActionListener(new Escuchador());
		
		marco.add(boton1);
		marco.add(boton2);
		
		marco.pack();
		marco.setVisible(true);
		
	}
}

class Escuchador implements ActionListener{
	
	public void actionPerformed(ActionEvent ae) {
		
		JFrame marco2 = new JFrame("Esta es la respuesta");
		marco2.setBounds(200,100,400,100);
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marco2.setVisible(true);
		
		JLabel etiqueta = new JLabel("Que tengas un buen día!! te desea "+ae.getActionCommand());
		marco2.add(etiqueta);
		
	}
	
}
