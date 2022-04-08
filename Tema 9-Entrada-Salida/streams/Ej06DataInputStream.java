package streams;
import java.io.*;

public class Ej06DataInputStream {
	
	public static void main(String[] args) throws IOException {
		FileInputStream filein = new FileInputStream("personas.jor");
		DataInputStream dataIS = new DataInputStream(filein);
		String n;
		int e;
		try {
			while (true) {
				n = dataIS.readUTF();
				e = dataIS.readInt();
				System.out.println("Nombre: " + n + ", edad: " + e);
			}
		} catch (EOFException eo) {
		}
		dataIS.close();
	}
}
