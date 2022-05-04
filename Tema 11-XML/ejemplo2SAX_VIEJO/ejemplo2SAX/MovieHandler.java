package ejemplo2SAX_VIEJO.ejemplo2SAX;

import org.xml.sax.Attributes;  
import org.xml.sax.SAXException;  
import org.xml.sax.helpers.DefaultHandler;  
  
/** 
 * Clase que procesa los eventos SAX al leer el xml de una movie. 
 * Guardar� todos los datos obtenidos del xml en el objeto movie, 
 * el cual se pasa en el constructor. 
 *  
 * 
 */  
public class MovieHandler extends DefaultHandler{  
  
   private String valor = null;  
     
   private Movie movie;  
     
   public MovieHandler(Movie movie){  
      this.movie=movie;
   }  
     
   @Override  
   public void startElement(String uri, String localName, String name,  
         Attributes attributes) throws SAXException {  
        
      // Limpiamos la variable temporal.  
      valor=null;  
        
      // Si la etiqueta es movie leemos el atributo id  
      if(localName.equals("movie")){  
         String id = attributes.getValue("id");  
         // Lo guardamos en el objeto movie  
         movie.setId(id);  
      }  
   }  
     
   @Override  
   public void characters(char[] ch, int start, int length)  
         throws SAXException {  
      // Guardamos el texto en la variable temporal  
      valor = new String(ch,start,length);  
   }  
  
   @Override  
   public void endElement(String uri, String localName, String name)  
         throws SAXException {  
      // Seg�n la etiqueta guardamos el valor leido   
      // en una propiedad del objeto movie  
      if (localName.equals("titulo")){  
         movie.setTitulo(valor);  
      }else if (localName.equals("anyo")){  
         movie.setAnyo(valor);  
      }else if (localName.equals("descripcion")){  
         movie.setDescripcion(valor);  
         System.out.println(movie.toString());
      }  
        
   }  
  
}  