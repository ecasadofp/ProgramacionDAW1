package ejemploOrdenacion;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCoches {

	ArrayList<Coche> listaCoches;
	
	
	public ArrayListCoches() {
		
		listaCoches = new ArrayList<>();
	}
	
	public void insertar(Coche c) {
		
		listaCoches.add(c);
		
	}
	
	public void imprimirLista() {
		
		for(Coche c:listaCoches)
			System.out.println(c);
		System.out.println();
	}
	
	public void ordenar() {
	
		
		Collections.sort(listaCoches);
	}

	public void ordenarModelo() {
		
		listaCoches.sort(null);
		
	}
	
	public void ordenarAnno() {
		
		Collections.sort(listaCoches,new AnnoComparator());
		
	}
	
}
