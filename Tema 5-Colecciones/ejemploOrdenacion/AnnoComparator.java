package ejemploOrdenacion;

import java.util.Comparator;

public class AnnoComparator implements Comparator<Coche>{
	
	public int compare(Coche c1, Coche c2) {
		
		return c1.getAnno()-c2.getAnno();
	}

}
