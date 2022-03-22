package streams;
import java.io.*;

public class Ej05DataOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileout = new FileOutputStream("/home/ecasado/personas.jor");
		DataOutputStream dataOS = new DataOutputStream(fileout);
		String nombres[] = { "Oscar", "Pablo", "Eva", "Alberto", "Marta" };
		int edades[] = { 25, 26, 27, 28, 32 };
		for (int i = 0; i < edades.length; i++) {
			dataOS.writeUTF(nombres[i]);
			dataOS.writeInt(edades[i]);
		}
		dataOS.close();

	}
}
