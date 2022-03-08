package ejemplointerfaces;

public class Vehiculo {
	private String matricula;
	private String description;
	
	public Vehiculo(String matricula, String descripcion) {
		this.matricula = matricula;
		this.description = descripcion;
	}

	public Double mueve (Integer km) {
		System.out.println("Moviendo vehículo: " + this.toString());
		return Math.random() * km;
	}
	
	@Override
	public String toString() {
		return "Vehículo [matrícula: " + matricula + 
				", descripción: " + description + "]";
	}	
}
