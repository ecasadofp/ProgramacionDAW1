package ejemplo_clase_abstracta;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] Args) {

		LocalDate fecha1 = LocalDate.of(2019, Month.NOVEMBER, 22); // 22 de noviembre
		ProgramadorTemporal pi1 = new ProgramadorTemporal("José", "Hernández López", 45, "45221887-K", fecha1);
		ProgramadorTemporal pi2 = new ProgramadorTemporal("Andrea", "Moltó Parra", 87, "72332634-L", fecha1);
		ProgramadorTemporal pi3 = new ProgramadorTemporal("José", "Ríos Mesa", 76, "34998128-M", fecha1);
		ProgramadorFijo pt1 = new ProgramadorFijo("Juan", "Pérez Pérez", 23, "73-K");
		ProgramadorFijo pt2 = new ProgramadorFijo("Alberto", "Centa Mota", 49, "88-L");
		ProgramadorFijo pt3 = new ProgramadorFijo("Marta", "Centa Mota", 44, "81-F");
		ListinProgramadores listinProgramadorado = new ListinProgramadores();
		listinProgramadorado.addProgramador(pi1);
		listinProgramadorado.addProgramador(pi2);
		listinProgramadorado.addProgramador(pi3);
		listinProgramadorado.addProgramador(pt1);
		listinProgramadorado.addProgramador(pt2);
		listinProgramadorado.addProgramador(pt3);
		listinProgramadorado.imprimirListin();
		System.out.println("El importe de las nóminas de los Programadores que consta en el listín es "
				+ listinProgramadorado.importeTotalNominaProgramadorado() + " euros");

	}
}