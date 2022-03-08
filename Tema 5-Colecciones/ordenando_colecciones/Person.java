package ordenando_colecciones;
public class Person implements Comparable<Person> {
	
	private int idPersona;
    private String nombre;
    private int altura;

    public Person (int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;}

    @Override
    public String toString() {
        return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura;}

    @Override
    public int compareTo(Person o) {
        //return this.nombre.compareTo(o.nombre);
    	return this.altura - o.altura;
    }

    public int getIdPersona() {return idPersona;}
    public String getNombre() {return nombre;}
    public int getAltura() {return altura;}
}