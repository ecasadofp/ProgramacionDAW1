package ejemplo_clase_abstracta;

public abstract class Programador extends Persona {

	private String IdProgramador;

	public Programador() {
		super();
		IdProgramador = "Desconocido";
	}

	public Programador(String nombre, String apellidos, int edad, String id) {
		super(nombre, apellidos, edad);
		IdProgramador = id;
	}

	// Métodos

	public void setIdProgramador(String IdProgramador) {
		this.IdProgramador = IdProgramador;
	}

	public String getIdProgramador() {
		return IdProgramador;
	}

	public void mostrarDatos() {

		System.out.println("Datos Programador. Programador de nombre: " + getNombre() + " " +

				getApellidos() + " con Id de Programador: " + getIdProgramador());
	}

	public String toString() {
		return super.toString().concat(" - IdProgramador: ").concat(IdProgramador);
	}

	public abstract double importeNomina();

}