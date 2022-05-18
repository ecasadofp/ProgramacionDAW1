package ejemplosComplementarios;
import java.io.File;

import javax.swing.JFileChooser;

public class SeleccionaFichero {
	
	public static void main(String[] args) {
		
	
	File fichero;
		
		JFileChooser seleccionador = new JFileChooser();	
		seleccionador.showOpenDialog(null);
		
		fichero = seleccionador.getSelectedFile();
		
		System.out.println(fichero);	

	}

}
