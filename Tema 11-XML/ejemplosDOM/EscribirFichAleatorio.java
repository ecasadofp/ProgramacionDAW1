package ejemplosDOM;

import java.io.*;
public class EscribirFichAleatorio {
	public static void main (String[] args) throws IOException {
		File fichero = new File ("ejemplosDOM/AleatorioEmple.dat");
		RandomAccessFile file = new RandomAccessFile(fichero, "rw");
		String apellido[]= {"FERNANDEZ", "GIL", "LOPEZ", "RAMOS",
							"SEVILLA", "CASTILLA", "REY"};
		int dep[]={10, 20, 10, 10, 30, 30, 20};
		Double salario[]={1000.45, 2400.60, 3000.0, 1500.56,
						  2200.0, 1435.87, 2000.0};
		StringBuffer buffer = null;
		int n=apellido.length;
		for (int i=0; i<n; i++){
			file.writeInt(i+1);
			buffer = new StringBuffer (apellido[i]);
			buffer.setLength(10);
			file.writeChars(buffer.toString());
			file.writeInt(dep[i]);
			file.writeDouble(salario[i]);
		}
		file.close();
	}

}
