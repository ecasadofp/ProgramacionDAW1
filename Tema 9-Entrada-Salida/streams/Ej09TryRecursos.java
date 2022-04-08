package streams;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Ej09TryRecursos {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("/home/ecasado/ejemplo.txt"); BufferedReader br = new BufferedReader(fr)) {

			int leido = fr.read();
			// String linea = br.readLine();

			while (leido != -1) {
				System.out.println((char) leido);
				leido = fr.read();
			}
		} catch (IOException e) {
			System.out.println("Error de lectura");
		}

	}

}
