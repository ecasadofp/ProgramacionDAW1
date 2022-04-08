package streams;
import java.io.*;
import java.util.Date;
public class Ej15EjemploSerializacionObjeto {
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("prueba.txt");
			ObjectOutputStream sos = new ObjectOutputStream(fos);
			sos.writeObject("Hoy es");
			sos.writeObject(new Date());
			sos.close();
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
