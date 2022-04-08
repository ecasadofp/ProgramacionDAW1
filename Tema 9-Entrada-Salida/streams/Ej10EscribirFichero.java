package streams;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Ej10EscribirFichero {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:\\salida.txt");
			PrintWriter pw = new PrintWriter(fos);
			pw.println("Imprimimos una cadena y un entero " + 5);
			pw.flush();
			pw.close();
			fos.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e2) {
		}
	}
}
