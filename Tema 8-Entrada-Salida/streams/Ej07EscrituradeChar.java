package streams;
import java.io.*;

//PASADO
public class Ej07EscrituradeChar {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/home/ecasado/spainIsDiferent.txt");
			fw.write('B');
			fw.write('a');
			fw.write('h');
			fw.write('í');
			fw.write('a');
			fw.write(' ');
			fw.write('E');
			fw.write('s');
			fw.write('p');
			fw.write('a');
			fw.write('ñ');
			fw.write('o');
			fw.write('l');
			fw.write('a');
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
