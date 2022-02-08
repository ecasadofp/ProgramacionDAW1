package excepciones;
/**
 * Escriba un programa que genere un número aleatorio
 * e indique si el número generado es par o impar.
 * El programa utilizará para ello el lanzamiento de una excepción.
 */


/**
 * Escriba un programa que genere un número aleatorio
 * e indique si el número generado es par o impar.
 * El programa utilizará para ello el lanzamiento de una excepción.
 */


public class ExcepcionParImpar {

    public static void main(String args[]){
    	try{
    		System.out.println("Generando numero aleatorio .... ");
			int entero = (int)(Math.random() * 100);
			if(entero%2 == 0){
				throw new Exception("Se generó el numero par: " + entero);
			}else{
				throw new Exception("Se generó el numero impar: " + entero);
			}
			//System.out.println("Esta línea no se ejecutará nunca");
			// y de hecho me da error de compilación si la pongo
    	}
    	catch(Exception e){
			System.out.println(e.getMessage());
    	}
}
}