package ejemplo_clase_abstracta;

import java.time.LocalDate;

public class EjemploInstanceof {

	public static void main(String[] args) {

		LocalDate fecha1 = LocalDate.of(2019, 11, 22); // 22 de noviembre

		ProgramadorTemporal pt1 = new ProgramadorTemporal("José", "Ríos Mesa", 76, "34998128-M", fecha1);
		ProgramadorFijo pf1 = new ProgramadorFijo("Juan", "Pérez Pérez", 23, "73-K");
		Programador p1 = new ProgramadorFijo("Marta", "Centa Mota", 44, "81-F");

		System.out.println("pt1 instanceof ProgramadorTemporal es: "+ (pt1 instanceof ProgramadorTemporal));	// true
		System.out.println("pt1 instanceof Programador es: "+ (pt1 instanceof Programador));					// true
		System.out.println("p1 instanceof Programador es: "+ (p1 instanceof Programador));						// frue
		System.out.println("p1 instanceof ProgramadorFijo es: "+ (p1 instanceof ProgramadorFijo));				// true
		System.out.println("p1 instanceof ProgramadorTemporal es: "+ (p1 instanceof ProgramadorTemporal));		// false
		
		p1 = pt1;
		
		System.out.println("p1 instanceof ProgramadorFijo es: "+ (p1 instanceof ProgramadorFijo));				// false
		System.out.println("p1 instanceof ProgramadorTemporal es: "+ (p1 instanceof ProgramadorTemporal));		// true
			
		
	}

}
