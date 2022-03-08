package ejemplo_clase_abstracta;

import java.util.ArrayList;
import java.util.Iterator;

public class ListinProgramadores {
	private ArrayList<Programador> listinProgramadores;

	public ListinProgramadores() {
		listinProgramadores = new ArrayList<Programador>();
	}

	public void addProgramador(Programador Programador) {
		listinProgramadores.add(Programador);
	}

	public void imprimirListin() {

		String tmpStr1 = "";

		System.out.println("Se procede a mostrar los datos de los Programadores existentes en el listín \n");

		for (Programador p : listinProgramadores) {
			System.out.println(p.toString());
			if (p instanceof ProgramadorTemporal) {
				tmpStr1 = "Temporal";
			} else {
				tmpStr1 = "Fijo";
			}

			System.out.println("- Tipo de este Programador: " + tmpStr1 + " - Nómina de este Programador: "
					+ (p.importeNomina()) + " €\n");
		}

	}

	public double importeTotalNominaProgramadorado() {

		double importeTotal = 0;

		Iterator<Programador> it = listinProgramadores.iterator();

		while (it.hasNext()) {
			importeTotal = importeTotal + it.next().importeNomina();
		}

		return importeTotal;

	}

}