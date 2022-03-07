package ejemplointerfaces_solmejorada;

public class Coche implements Vehiculo {
	private String matricula;;
	private String descripcion;
	
	public Coche(String matricula, String descripcion) {
		this.matricula = matricula;
		this.descripcion = descripcion;
	}

	public double mueve (Integer km) {
		System.out.println("Moviendo vehículo: " + this.toString());
		return Math.random() * km;
	}
	
	@Override
	public String toString() {
		return "Coche [matrícula: " + matricula + 
				", descripción: " + descripcion + "]";
	}
}
