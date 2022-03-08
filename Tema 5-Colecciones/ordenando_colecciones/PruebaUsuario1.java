package ordenando_colecciones;
import java.util.ArrayList;
import java.util.Collections;

public class PruebaUsuario1 {

	public static void main(String[] args) {
		ArrayList<Usuario1> lista = new ArrayList<Usuario1>();
		 lista.add(new Usuario1("uno", 11));
		 lista.add(new Usuario1("dos", 2));
		 lista.add(new Usuario1("tres", 3));
		 lista.add(new Usuario1("cuatro", 44));
		 System.out.println("\n Imprimo el objeto lista directamente:");
         System.out.println(lista);
         System.out.println("\n Imprimo el objeto lista con método;");
         imprimirLista(lista);
		 System.out.println("\n Ahora ordenados por nombre...");
		 Collections.sort(lista, new NombreComparator());
		 //metodo que imprime la lista
		 imprimirLista(lista);
		 System.out.println("\n y ahora ordenados por edad...");
		 Collections.sort(lista, new EdadComparator());
		 //metodo que imprime la lista
		 imprimirLista(lista);
		 

	}
   private static void imprimirLista (ArrayList<Usuario1> lista){
	   for (Usuario1 usu: lista)
		   System.out.println(usu);
   }
}
