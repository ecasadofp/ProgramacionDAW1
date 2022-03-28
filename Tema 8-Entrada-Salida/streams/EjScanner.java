package streams;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class EjScanner {

	public static void main(String args[]) {

		Scanner sc;
		double suma = 0;
		int contador = 0;

		try (FileInputStream fis = new FileInputStream("/home/ecasado/ejemplo.txt")) {

			sc = new Scanner(fis);

			while (sc.hasNextDouble()) {

				suma += sc.nextDouble();
				contador++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (contador == 0)
			System.out.println("El archivo no contiene datos");
		else
			System.out.format("La suma vale %.2f y la media %.3f", suma, (suma / contador));

	}

}
