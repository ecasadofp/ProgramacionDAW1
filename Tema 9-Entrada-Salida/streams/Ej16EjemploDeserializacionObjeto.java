package streams;
import java.io.*;
import java.util.Date;
public class Ej16EjemploDeserializacionObjeto {
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("prueba.txt");
			ObjectInputStream sis = new ObjectInputStream(fis);
			System.out.println((String)sis.readObject());
			System.out.println((Date)sis.readObject());
			sis.close();
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
