package ejemplointerfacesJava;

/* Ejemplo Clase e Interfaz Cloneable aprenderaprogramar.com */

public class Person implements Cloneable{
   public int dni, edad;
      public Person( int d, int e) {     this.dni = d;       this.edad = e;     }
 
      public Person clone()   {
    
      Person clon = new Person(this.dni,this.edad);
      return clon;
   }
 }