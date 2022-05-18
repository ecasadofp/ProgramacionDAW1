package ejemplos;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class EjemploJList extends JFrame{
	
	String[] elementos = {"Bases de datos", "Sistemas", "Entornos", "Marcas", "Inglés", "FOL", "Programación"};
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(()->new EjemploJList());

	}
	
	public EjemploJList() {
		
		
		JList<String> lista = new JList<>(elementos);
		lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		lista.setLayoutOrientation(JList.VERTICAL_WRAP);
		lista.setVisibleRowCount(3); // En orientación vertical, el número de filas respresentadas (0 para auto)
		
		lista.addListSelectionListener((e)->actuarSeleccion(e));
		
		JScrollPane listaScroller = new JScrollPane(lista);
		listaScroller.setPreferredSize(new Dimension(250,80));
		
		add(listaScroller);
		
		JButton btnTerminar = new JButton("Terminar selección");
		btnTerminar.addActionListener((ae)->actuarBoton(lista.getSelectedValuesList().toArray()));
		
		add(btnTerminar,BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	public void actuarSeleccion(ListSelectionEvent e) {
		
		JOptionPane.showMessageDialog(null,"Has elegido "+elementos[e.getFirstIndex()]);
	}
	
	public void actuarBoton(Object[] elegidos) {
		
		String salida = "Has elegido: ";
		for(Object s:elegidos)
			salida += (", "+s);
		JOptionPane.showMessageDialog(null, salida);
		
	}

}
