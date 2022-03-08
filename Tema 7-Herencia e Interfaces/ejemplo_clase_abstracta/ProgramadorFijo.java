package ejemplo_clase_abstracta;

public class ProgramadorFijo extends Programador {

	public ProgramadorFijo(String nombre, String apellidos, int edad, String id) {

		super(nombre, apellidos, edad, id);
	}

	public double importeNomina() {
		return 30 * 43.20;
	}

}