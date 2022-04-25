package bluej;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutCalculadora {

	public static void main(String[] args) {

		new LayoutCalculadora();
		
	}
	
	public LayoutCalculadora() {
		
		JFrame marco = new JFrame("Distintos layouts");
				
		
		JLabel et1 = new JLabel("Primera");
		JLabel et2 = new JLabel("Segunda");
		JLabel et3 = new JLabel("Tercera");
		JLabel et4 = new JLabel("Cuarta");
		
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);
		JTextField tf3 = new JTextField(10);
		JTextField tf4 = new JTextField(10);
		
		JButton btn1 = new JButton("Uno");
		JButton btn2 = new JButton("Dos");
		JButton btn3 = new JButton("Tres");
		
		
		JPanel entradas = new JPanel();
		JPanel botones = new JPanel();

		entradas.setLayout(new GridLayout(4, 2, 5, 5));
		entradas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		entradas.add(et1);
		entradas.add(tf1);
		entradas.add(et2);
		entradas.add(tf2);
		entradas.add(et3);
		entradas.add(tf3);
		entradas.add(et4);
		entradas.add(tf4);
		
		marco.add(entradas);
		
		
		marco.pack();
		marco.setVisible(true);
		
		botones.add(btn1);
		botones.add(btn2);
		botones.add(btn3);
		
		marco.add(botones,BorderLayout.SOUTH);
		
	}

}
