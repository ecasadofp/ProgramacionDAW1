package ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxes2 extends JFrame implements ItemListener {
	
	public ComboBoxes2() {
		
		super("ComboBoxes");
		setLayout(null);
		setSize(345, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComboBox modulo = new JComboBox();

		modulo.setBounds(40, 10, 180, 30);

		modulo.addItem("Bases de Datos");
		modulo.addItem("Inglés");
		modulo.addItem("Entornos de desarrollo");
		modulo.addItem("Programación");
		
		modulo.addItemListener(this);
		
		add(modulo);
		setVisible(true);
	}

	public static void main(String[] arguments) {
		ComboBoxes2 cb = new ComboBoxes2();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if (e.getStateChange() == ItemEvent.SELECTED)
			JOptionPane.showMessageDialog(null, "Has elegido: " + e.getItem().toString(), "Lo hiciste! ",
					JOptionPane.INFORMATION_MESSAGE);
	}

}
