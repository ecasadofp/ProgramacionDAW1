package ejemplointerfacesJava;
// Persona2.java: implementa un interfaz

public class Persona2 implements Comparable<Persona2>{
  private Nif nif;
  private int edad;
  private String nombre, apellidos;

  // Constructor predeterminado
  public Persona2() {
    nif = new Nif();
    edad = 0;
    nombre = new String("");
    apellidos = new String("");
  }

  // Constructor parametrizado
  public Persona2(long dni, int edad, String nombre, String apellidos) {
    this.nif = new Nif(dni);
    this.edad = edad;
    this.nombre = nombre;
    this.apellidos = apellidos;
  }

  // Accedentes

  public Nif dameNif() { return nif; }

  public int dameEdad() { return edad; }

  public String dameNombre() { return nombre; }

  public String dameApellidos() { return apellidos; }

  // Mutadores

  public void ponNif(Nif nif) { this.nif = nif; }

  public void ponEdad(int edad) { this.edad = edad; }

  public void ponNombre(String nombre) { this.nombre = nombre; }

  public void ponApellidos(String apellidos) { this.apellidos = apellidos; }

  // Resto de métodos

  public void ponDni(long dni) { nif.ponDni(dni); }

  public String toString() {
    return nif.toString() + "\n" + nombreCompleto() + "\nEdad: " + edad + "\n";
  }

  public String nombreCompleto() { // nombre y apellidos
    return nombre + " " + apellidos;
  }

  public void leer() { // lectura de los datos de la persona
    nif.leer();
    System.out.print("Nombre: ");
    nombre = MyInput.readString();
    System.out.print("Apellidos: ");
    apellidos = MyInput.readString();
    System.out.print("Edad: ");
    edad = MyInput.readInt();
  }

  public int compareTo(Persona2 p) {
    String este = nombreCompleto();
    String otro = p.nombreCompleto();
    return este.compareToIgnoreCase(otro);
  }
}
