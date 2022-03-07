package ejemplointerfaces;

public class Viajero {
	private String nombre;
	private Vehiculo vehiculo;

	public Viajero(String nombre, Vehiculo vehiculo) {
		this.nombre = nombre;
		this.vehiculo = vehiculo;
	}

	public Double mover(Integer km) {
		System.out.printf("%s viajando %d kilómetros %n" , nombre, km);
		Double coste = vehiculo.mueve(km);
		return coste;
	}
}
