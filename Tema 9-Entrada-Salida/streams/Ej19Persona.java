package streams;
//Clase Persona
import java.io.Serializable;
public class Ej19Persona implements Serializable{
    private String nif;
    private String nombre;
    private int edad;

    public Ej19Persona() {
    }

    public Ej19Persona(String nif, String nombre, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
