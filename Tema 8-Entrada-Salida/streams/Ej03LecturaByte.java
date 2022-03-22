package streams;
import java.io.*;
// PASADO
public class Ej03LecturaByte {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int aux = 0;
		try {
			
			fis = new FileInputStream("/home/ecasado/alberto.txt");
			while((aux = fis.read()) != -1)
				System.out.println(aux + " - " +  (char) aux);
		} catch(FileNotFoundException ex) {
				ex.printStackTrace();
		} catch(IOException ex) {
				ex.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}


