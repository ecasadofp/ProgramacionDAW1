package expresionesRegulares;

public class EjValueOf {

	public static void main(String[] args) {

		String nombre = "Pepito";
		int edad = 4;
		double altura = 1.765;

		String formateado = String.format("Nombre: %-10s, %d años y %7.2f cm de altura", nombre, edad, altura);

		System.out.println(formateado);

		String strEdad = String.valueOf(edad);

		String booleano = String.valueOf(4 > 67);

		String nombresBruto = "Jorge Pueyo->José Manuel->Jorge Romano->Iván->Ángel->";
		String[] nombres = nombresBruto.split("->");
		
		System.out.println("La primera ocurrencia de Manuel es " + nombresBruto.indexOf("Manuel"));
		System.out.println("La primera ocurrencia de Jorge es " + nombresBruto.indexOf("Jorge",1));

		for (String m : nombres)
			System.out.println(m);

		String[] modulos = { "Entornos", "Bases de datos", "Sistemas", "Inglés", "FOL", "Marcas", "Programación" };

		for (String m : modulos)
			System.out.println(m);

		System.out.println("Los datos para exportar modulos son ");
		System.out.println(exportaDatos(modulos));

		System.out.println("Los nombres de alumnos preparados para exportar son ");
		System.out.println(exportaDatos(nombres));
	}

	public static String exportaDatos(String[] datos) {

		StringBuilder salida = new StringBuilder();
		
		for (String d : datos) {
			salida.append(d);
			salida.append(",");
		}
		return salida.toString();
	}

}
