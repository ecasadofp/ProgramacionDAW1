package ejemplointerfaces_solmejorada;

public class Tren implements Vehiculo {
	private String descripcion;
	
	public Tren(String descripcion) {
		this.descripcion = descripcion;
	}

	public double mueve (Integer km) {
		System.out.println("Moviendo vehículo: " + this.toString());
		return Math.random() * km;
	}
	
	@Override
	public String toString() {
		return "Tren [descripcion: " + descripcion + "]";
	}
}
