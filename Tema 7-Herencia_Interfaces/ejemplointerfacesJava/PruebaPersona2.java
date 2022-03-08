package ejemplointerfacesJava;

public class PruebaPersona2 {
  public static void main(String args[]) {
    Persona2 per1 = new Persona2(435762, 23, "Javier", "Hernandez Perez");
    System.out.println(per1);
    Persona2 per2 = new Persona2(112233, 22, "Javier", "Gomez Alvarez");
    System.out.println(per2);
    if(per1.compareTo(per2) < 0)
      System.out.println("per1 es menor que per2");
    else if(per1.compareTo(per2) > 0)
      System.out.println("per1 es mayor que per2");
    else
      System.out.println("per1 es igual que per2");

  }
}