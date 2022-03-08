package treeSetProducto;
/**
 * @(#)Producto.java
 *
 *
 * @author Antonio Rivero
 * @version 1.00 2015/7/23
 */

public class Producto implements Comparable<Producto> {
	
	private String nombre;
	private int cantidad; 
	
	public Producto(String s, int i) {
		
		nombre = s;
		cantidad = i;
	}
	
	public String toString(){
		return ("Nombre: "+nombre+" Cantidad: "+cantidad);
	}
	
	public int compareTo(Producto p ) {
		
		// Indica en base a que atributos se compara el objeto
		// Devuelve +1 si this es > que objeto
		// Devuelve -1 si this es < que objeto
		// Devuelve 0 si son iguales


		
		return( this.cantidad-p.cantidad );
	}
}