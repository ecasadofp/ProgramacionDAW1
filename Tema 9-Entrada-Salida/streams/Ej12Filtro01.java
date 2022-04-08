package streams;
import java.io.*;
public class Ej12Filtro01 {
	public static void main(String[] args)
	{
		FileReader fr = null;
		BufferedReader filtro=null;
		String aux = null;
		try
		{
			fr = new FileReader("D:\\Prueba.txt");
			filtro=  new BufferedReader (fr);
			while((aux = filtro.readLine()) != null)
			System.out.println(aux);
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
