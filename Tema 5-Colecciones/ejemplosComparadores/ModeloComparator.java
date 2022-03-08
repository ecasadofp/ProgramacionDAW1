package ejemplosComparadores;

import java.util.Comparator;

public class ModeloComparator implements Comparator<Coche>{

	@Override
	public int compare(Coche c1, Coche c2) {

		return c1.getModelo().compareToIgnoreCase(c2.getModelo());
	}
	
	

}
