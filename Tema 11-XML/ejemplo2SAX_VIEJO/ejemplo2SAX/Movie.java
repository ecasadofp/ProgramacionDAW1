package ejemplo2SAX_VIEJO.ejemplo2SAX;

public class Movie {
	
	private String id = null;  
	   private String titulo = null;  
	   private String anyo = null;  
	   private String descripcion= null;  
	     
	   // Constructor por defecto  
	   public Movie() {  
	        
	   }  
	     
	   public String getId() {  
	      return id;  
	   }  
	     
	   public void setId(String id) {  
	      this.id = id;  
	   }  
	     
	   public String getTitulo() {  
	      return titulo;  
	   }  
	     
	   public void setTitulo(String titulo) {  
	      this.titulo = titulo;  
	   }  
	     
	   public String getAnyo() {  
	      return anyo;  
	   }  
	     
	   public void setAnyo(String anyo) {  
	      this.anyo = anyo;  
	   }  
	     
	   public String getDescripcion() {  
	      return descripcion;  
	   }  
	     
	   public void setDescripcion(String descripcion) {  
	      this.descripcion = descripcion;  
	   }  
	  
	   @Override  
	   public String toString() {  
	      StringBuilder sb = new StringBuilder();  
	      sb.append("\nId: "+id);  
	      sb.append("\nT�tulo: "+titulo);  
	      sb.append("\nA�o: "+anyo);  
	      sb.append("\nDescripcion: "+descripcion);  
	        
	      return sb.toString();  
	   }  
	     


}
