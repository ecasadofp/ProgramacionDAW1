package streams;
import java.io.*;
// PASADO
public class Ej08LecturaChar {
	public static void main(String[] args){
		FileReader fr = null;
		int aux = 0;
		try{
			 fr = new FileReader("/home/ecasado/spainIsDiferent.txt");
			while((aux = fr.read()) != -1)
				System.out.println((char)aux);
		} catch(FileNotFoundException ex) {
				ex.printStackTrace();
	    } catch(IOException ex) {
			ex.printStackTrace();
		} finally {
				try {
					fr.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
		}
	}
}





