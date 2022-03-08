package colecciones;

import java.util.Iterator;
import java.util.LinkedList;

public class EjemploIterador {

	public static void main(String[] args) {

		LinkedList<Persona> misAmigos = new LinkedList<>();
		Iterator<Persona> it;

		Persona invisible = new Persona(5353, 34, "Nadie", "Ninguno");

		misAmigos.add(new Persona(34, 4, "Rafa", "Nadal"));
		misAmigos.add(new Persona(64, 74, "Pepito", "Grillo"));
		misAmigos.add(new Persona(49642, 49, "Paco", "Pi"));
		misAmigos.add(new Persona(3534, 464, "Malo", "Malote"));
		misAmigos.add(new Persona(5464, 4, "Paqui", "Mur"));
		misAmigos.add(new Persona(5346, 5, "Enemigo", "Total"));
		misAmigos.add(new Persona(624, 7, "María", "Castrillo"));

		System.out.println("Mostramos los elementos con un for each");

		for (Persona p : misAmigos)
			System.out.println(p);

		System.out.println("Mostramos los elementos con un iterador");
		it = misAmigos.iterator();

		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("Intentamos cambiar al Malo a invisible con un for each");

		for (Persona p : misAmigos)
			if (p.dameNombre().equals("Malo"))
				p = invisible;

		System.out.println("Intentamos cambiar al Malo a invisible con un iterador");

		it = misAmigos.iterator(); // Atención, tengo que volver a generar el iterador, si no ya estaría recorrido
									// y por tanto "gastado"

		while (it.hasNext()) {
			Persona p = it.next();
			if (p.dameNombre().equals("Malo"))
				p = invisible;
		}

		System.out.println("Cambiamos Paco a Francisco con un for each");

		for (Persona p : misAmigos) {
			if (p.dameNombre().equals("Paco"))
				p.ponNombre("Francisco");
		}

		System.out.println("Cambiamos Paqui a Francisca con un iterador");

		it = misAmigos.iterator(); // Atención, tengo que volver a generar el iterador, si no ya estaría recorrido
									// y por tanto "gastado"

		while (it.hasNext()) {
			Persona p = it.next();
			if (p.dameNombre().equals("Paqui"))
				p.ponNombre("Francisca");
		}

		System.out.println("Eliminamos al enemigo. Esto solo podemos hacerlo con un iterador");

		it = misAmigos.iterator(); // Atención, tengo que volver a generar el iterador, si no ya estaría recorrido
									// y por tanto "gastado"

		while (it.hasNext()) {
			Persona p = it.next();
			if (p.dameNombre().equals("Enemigo"))
				it.remove(); // Atención, elimino en el ierador, no el objeto con algo como p.remove()
		}

		System.out.println("Mostramos los elementos con un for each");

		for (Persona p : misAmigos)
			System.out.println(p);
	}
}
