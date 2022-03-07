package varios;
// Alumno.java: una clase para representar alumnos

public class Al extends Per {
  private int curso;

  // Constructor predeterminado
  public Al() {
    super();
    curso = 1;
  }

  // Constructor parametrizado
  public Al(long dni, int edad, String nombre, String apellidos, int curso) {
    super(dni, edad, nombre, apellidos);
    this.curso = curso;
  }

  // Accedente

  public int dameCurso() { return curso; }

  // Mutador

  public void ponCurso(int curso) { this.curso = curso; }

  // Otros métodos

  @Override
  public String toString() {
    return super.toString() + "Curso: " + curso + "\n";
  }

  public void leer() { // lectura de los datos del alumno
    super.leer();
    System.out.print("Curso: ");
    curso = MyInput.readInt();
  }
}
