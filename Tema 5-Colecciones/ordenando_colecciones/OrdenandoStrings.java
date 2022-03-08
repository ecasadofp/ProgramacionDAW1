package ordenando_colecciones;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenandoStrings {
    
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		 lista.add("uno");
		 lista.add("dos");
		 lista.add("tres");
		 lista.add("cuatro");
		 imprimirLista(lista);
		 System.out.println("\n Ahora ordenados...");
		 Collections.sort(lista);
		 //metodo que imprime la lista
		 imprimirLista(lista);
	}

	private static void imprimirLista(ArrayList<String> lista) {
		for (String cadena : lista)
			System.out.println(cadena);
	}
	
}
