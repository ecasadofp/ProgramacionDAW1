package varios;
// Nif.java: una clase Nif para representar N.I.F.s

public class Nif {
  private long dni;
  private char letra;

  public Nif() { // NIF no válido
    dni = 0;
    letra = ' ';
  }

  public Nif(long dni) {
    this.dni = dni;
    letra = laLetra(dni);
  }

  // Accedentes (para los dos atributos)
  public long dameDni() { return dni; }
  public char dameLetra() { return letra; }

  // Mutador sólo para el DNI, ya que la
  // letra se ha de asignar automáticamente
  public void ponDni(long d) {
 	  dni = d;
 	  letra = laLetra(dni);
  }

  public void leer() {
    System.out.print("Introduce el DNI: ");
    dni = MyInput.readLong();
    letra = laLetra(dni);
  }

  public String toString() {
    long pot = 10;
    String cad = "";
    for(int i = 1; i < 8; i++) {
      if(dni < pot) cad += "0";
      pot *= 10;
    }
    cad += dni + "-" + letra;
    return cad;
  }

  private char laLetra(long dni) {
    switch((int)dni % 23) {
 	 	  case  0 : return 'T';
 	 	  case  1 : return 'R';
      case  2 : return 'W';
      case  3 : return 'A';
      case  4 : return 'G';
      case  5 : return 'M';
      case  6 : return 'Y';
      case  7 : return 'F';
      case  8 : return 'P';
      case  9 : return 'D';
      case 10 : return 'X';
      case 11 : return 'B';
      case 12 : return 'N';
      case 13 : return 'J';
      case 14 : return 'Z';
      case 15 : return 'S';
      case 16 : return 'Q';
      case 17 : return 'V';
      case 18 : return 'H';
      case 19 : return 'L';
      case 20 : return 'C';
      case 21 : return 'K';
      case 22 : return 'E';
      default : return ' '; // Caso imposible
      // Para que no se queje el compilador.
    }
  }
}
