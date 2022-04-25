import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutCalculadora2 {

	public static void main(String[] args) {

		new LayoutCalculadora2();
		
	}
	
	public LayoutCalculadora2() {
		
		JFrame marco = new JFrame("Distintos layouts");
				
		
		JLabel et1 = new JLabel("Primera");
		JLabel et2 = new JLabel("Segunda");
		JLabel et3 = new JLabel("Tercera");
		JLabel et4 = new JLabel("Cuarta");
		
		et1.setVerticalAlignment(SwingConstants.TOP);
		et2.setVerticalAlignment(SwingConstants.TOP);
		et3.setVerticalAlignment(SwingConstants.TOP);
		et4.setVerticalAlignment(SwingConstants.TOP);
		
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);
		JTextField tf3 = new JTextField(10);
		JTextField tf4 = new JTextField(10);
		
		JButton btn1 = new JButton("Uno");
		JButton btn2 = new JButton("Dos");
		JButton btn3 = new JButton("Tres");
		
		
		JPanel entradas = new JPanel();
		JPanel botones = new JPanel();

		entradas.setLayout(new GridLayout(4, 1, 5, 5));
		entradas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		JPanel panEt1 = new JPanel();
		JPanel panEt2 = new JPanel();
		JPanel panEt3 = new JPanel();
		JPanel panEt4 = new JPanel();
		
		panEt1.add(tf1);
		panEt2.add(tf2);
		panEt3.add(tf3);
		panEt4.add(tf4);
		
		entradas.add(et1);
		entradas.add(panEt1);
		entradas.add(et2);
		entradas.add(panEt2);
		entradas.add(et3);
		entradas.add(panEt3);
		entradas.add(et4);
		entradas.add(panEt4);
		
		marco.add(entradas);
		
		
		marco.pack();
		marco.setVisible(true);
		
		botones.add(btn1);
		botones.add(btn2);
		botones.add(btn3);
		
		marco.add(botones,BorderLayout.SOUTH);
		
	}

}