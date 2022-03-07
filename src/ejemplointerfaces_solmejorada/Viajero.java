package ejemplointerfaces_solmejorada;

public class Viajero {
	private String nombre;
	private Vehiculo vehiculo;

	public Viajero(String nombre, Vehiculo vehiculo) {
		this.nombre = nombre;
		this.vehiculo = vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Double mover(Integer km) {
		System.out.println(nombre + " viajando " + km);
		Double cost = vehiculo.mueve(km);
		return cost;
	}

}
