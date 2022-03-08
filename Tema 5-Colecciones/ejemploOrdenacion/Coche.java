package ejemploOrdenacion;

public class Coche implements Comparable<Coche>{
	
	private String marca,modelo;
	private int anno;
	
	
	public Coche(String marca, String modelo, int anno) {

		this.marca = marca;
		this.modelo = modelo;
		this.anno = anno;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAnno() {
		return anno;
	}


	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	public int compareTo(Coche c) {
		
		return this.getMarca().compareToIgnoreCase(c.getMarca());
		
	}
	
	@Override
	public String toString() {
		
		return "Marca: " + marca + ", modelo: "+ modelo + ", año: " + anno;
		
	}

}
