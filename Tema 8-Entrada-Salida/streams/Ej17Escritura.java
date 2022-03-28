package streams;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ej17Escritura {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Ej19Persona p;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("personas.dat");
            salida = new ObjectOutputStream(fos);
            //Se crea el primer objeto Persona
            p = new Ej19Persona("12345678A","Alberto Carrera Martin", 30); // Ya le gustar�a....
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            //Se crea el segundo objeto Persona
            p = new Ej19Persona("98765432B","Teo Lairla Morlans", 25);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            //Se crea el tercer objeto Persona
            p = new Ej19Persona("78234212Z","Leticia García Quevedo", 23);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
           
        } catch (FileNotFoundException e) {
            System.out.println("1"+e.getMessage());
        } catch (IOException e) {
            System.out.println("2"+e.getMessage());
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                System.out.println("3"+e.getMessage());
            }
        }

    }
}