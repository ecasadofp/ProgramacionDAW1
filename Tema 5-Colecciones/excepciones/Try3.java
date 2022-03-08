package excepciones;
/**
 * Intentemos provocar también un error de tipo división por cero
 * y pongamos un catch específico para dicho error
 *
 * Podemos comprobar que se ejecuta el catch correspondiente al tipo de error generado.
 * La línea que lanza el error de índice la hemos comentado para que no lo genere y
 * podamos generar el error de división por cero.
 */

public class Try3{
	public static void main(String arg[]){
		int b = 0;
		int [] array = new int[20];
		 try
		 	{
			int a = 23/b;
         	array[6] = 24;	
			
			}
			catch(ArrayIndexOutOfBoundsException excepción)
		    {
		    System.out.println(" Error de índice en un array");
		    }
		    catch(ArithmeticException excepcion)
		    {
			System.out.println(" No se puede dividir entre 0");
		    }
		    catch (Exception e)
		 	{
		    System.out.println("Aquí entro si no lo he atrapado antes");
		   	System.out.println("Información del error");
		   	 System.out.println(e);
			 e.printStackTrace();
		 	}
		 finally{
			 System.out.println("Esto se ejecuta seguro pase lo que pase");
		 }
		 System.out.println("Continuo por aquí ....");
	}
}