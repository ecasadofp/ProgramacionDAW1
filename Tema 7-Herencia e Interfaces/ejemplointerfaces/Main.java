package ejemplointerfaces;


public class Main {
	public static void main(String[] args) {
		Vehiculo vehiculo = new Vehiculo("0666-JVL", "Opel Corsa");
		Viajero turista = new Viajero("Dr. Livingstone", vehiculo);
		
		System.out.printf("Coste del viaje: %.2f €%n%n", turista.mover(15));
		System.out.printf("Coste del viaje: %.2f €%n%n", turista.mover(123));
		System.out.printf("Coste del viaje: %.2f €%n%n", turista.mover(42));
	}
}
