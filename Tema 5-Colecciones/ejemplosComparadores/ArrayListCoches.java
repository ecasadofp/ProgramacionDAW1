package ejemplosComparadores;

import java.util.ArrayList;
import java.util.Collections;

//Esta clase trata de poner luz en el uso de los String y su "igualdad" en java. No sé si lo consigue.

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
		
		listaCoches.sort(new ModeloComparator());
	}
	
	public void ordenarAnno() {
		
		Collections.sort(listaCoches,new AnnoComparator());
		
	}
	
}
