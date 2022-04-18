package ejemplos;

import javax.swing.JOptionPane;

public class JoptionPane0 {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null,"Hola Buenos d�as");
		//JOptionPane.showMessageDialog(null,"Hola Buenos d�as", "Saludo", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "El ordenador se reiniciar� en dos segundos",
		//"Atenci�n", JOptionPane.WARNING_MESSAGE);
		
		//JOptionPane.showMessageDialog(null,"Error en la l�nea 20", 
		//		"Error de Compilaci�n", JOptionPane.ERROR_MESSAGE);
		//
		//String numeroString= JOptionPane.showInputDialog("Introduzca una cantidad entera");
		//int numero = Integer.parseInt(numeroString); // o directamente
		//int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca una cantidad entera"));
		//JOptionPane.showMessageDialog(null,"La ra�z cuadrada de " + numero + " vale " + Math.sqrt(numero));
		Object equipo = JOptionPane.showInputDialog(null,"Elige ganador",
				   "Semifinales copa rey 2019", JOptionPane.QUESTION_MESSAGE, null,
				  new String[] { "Real Madrid", "Barcelona"}, null);
		JOptionPane.showMessageDialog(null,"Elegiste: " + equipo);
		
	}

}
