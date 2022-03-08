package ordenando_colecciones;
public class Usuario1  {
 private String nombre;
 private int edad;
 Usuario1(String nombre, int edad) {
 this.nombre = nombre;
 this.edad = edad;
 }
 public String getNombre() {
 return nombre;
 }
 public int getEdad() {
 return edad;
 }
 public String toString() {
 return nombre + " (" + edad + ")";
 }
}