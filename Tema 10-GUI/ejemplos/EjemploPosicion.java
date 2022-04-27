package ejemplosClase;

import javax.swing.JFrame;
import javax.swing.JButton;

public class EjemploPosicion {

	public static void main(String[] args) {

		JFrame marco = new JFrame("Posicionando elementos");
		marco.setLayout(null); //No queremos asistente de diseño
		
		JButton boton1 = new JButton("Un botón");
		JButton boton2 = new JButton("Otro botón");
		
		boton1.setBounds(20, 10, 150, 40); //Damos las coordenadas y dimensiones del componente
		boton2.setBounds(20, 90, 150, 40);


		marco.add(boton1);
		marco.add(boton2);
		
		marco.setSize(600,400);
		marco.setVisible(true);
		
	}

}
