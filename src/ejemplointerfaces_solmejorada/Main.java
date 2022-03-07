package ejemplointerfaces_solmejorada;


public class Main {
	public static void main(String[] args) {
		Vehiculo vehiculo = new Coche("0666-JVL", "Opel Corsa");
		Vehiculo otroVehiculo = new Tren("Talgo 42");
		
		Viajero turista = new Viajero("Dr. Livingstone", vehiculo);
		
		System.out.printf("Coste del viaje: %.2f €%n%n", turista.mover(15));
		System.out.printf("Coste del viaje: %.2f €%n%n", turista.mover(16));
		
		turista.setVehiculo(otroVehiculo);
		
		System.out.printf("Coste del viaje: %.2f €%n%n", turista.mover(42));

	}
}
