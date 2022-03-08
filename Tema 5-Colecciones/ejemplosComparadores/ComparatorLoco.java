package ejemplosComparadores;

import java.util.Comparator;

public class ComparatorLoco implements Comparator<Coche> {
	
	public ComparatorLoco() {
		
		
	}
	
	public int compare(Coche c1, Coche c2) {
		
		//Ahora viene la implementación de la comparación
		
		
		int salida = 0;
		salida += diferenciaMarca(c1, c2);
		
		if (c1.getModelo().compareTo(c2.getModelo())>0)
			salida -=3;
		
		return salida;
	}
	
	public static int diferenciaMarca(Coche c1, Coche c2) {
		
		return c1.getMarca().length()-c2.getMarca().length();
		
	}

}
