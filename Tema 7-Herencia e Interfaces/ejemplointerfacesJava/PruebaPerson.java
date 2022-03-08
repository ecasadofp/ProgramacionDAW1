package ejemplointerfacesJava;
/* Ejemplo Clase e Interfaz Cloneable aprenderaprogramar.com */
 public class PruebaPerson {
   
     public static void main(String arg[]) {
        Person p = new Person(74999999,35);
        Person p2 = p.clone();
         // hemos clonado en el objeto p2 los datos de la Persona p , por tanto p2
        // tiene como dni 74999999 y una edad de 35
        // a continuación vamos a cambiar el dni de p
        p.dni=25454345;
        System.out.println("Datos Persona p: DNI:"+p.dni+" Edad:"+p.edad);
        System.out.println("Datos Persona p2 clon: DNI:"+p2.dni+" Edad:"+p2.edad);
       } 
 }