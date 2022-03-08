package ejemploOrdenacion;

public class Uso {

	public static void main(String[] args) {

		ArrayListCoches misCoches = new ArrayListCoches();
		
		misCoches.insertar(new Coche("Ford", "Mustang", 2018));
		misCoches.insertar(new Coche("Ferrary", "Gt 40", 2002));
		misCoches.insertar(new Coche("BMW", "M4", 1995));
		misCoches.insertar(new Coche("Chevrolet", "Impala", 1967));
		misCoches.insertar(new Coche("Audi", "TT", 2018));


			misCoches.imprimirLista();
			
			misCoches.ordenar();
			
			misCoches.imprimirLista();
			
			misCoches.ordenarAnno();
			
			misCoches.imprimirLista();
		
		

	}

}
