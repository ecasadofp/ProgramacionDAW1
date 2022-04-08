package streams;
import java.io.*;

// La clase PrintWriter, que deriva de Write, posee los métodos
// print(String), println(String), printf(String, args), etc, idénticos a los de System.Out.
// Ambos reciben un string y lo imprimen
// La clase PrintStream -- idem pero para bytes

public class Ej14Filtro {

	public static void main(String[] args) {
		
		try {
			PrintWriter fichero = new PrintWriter(new FileWriter("ejemplo.txt"));
			for (int i = 1; i < 6; i++)
				fichero.println("Fila número: " + i);
			fichero.close();
		} catch (FileNotFoundException fn) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}
	}
}
