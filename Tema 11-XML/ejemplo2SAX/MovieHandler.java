package ejemplo2SAX;

import java.util.ArrayList;

import org.xml.sax.Attributes;  
import org.xml.sax.SAXException;  
import org.xml.sax.helpers.DefaultHandler;  
  
/** 
 * Clase que procesa los eventos SAX al leer el xml de una movie. 
 * Guardará todos los datos obtenidos del xml en el objeto movie, 
 * el cual se pasa en el constructor. 
 *  
 * 
 */  
public class MovieHandler extends DefaultHandler{  
  
   private String id,titulo,anyo,descripcion;
	private String valor = null;
        
   private Movie movie; 
   private ArrayList<Movie> pelis;
   
     
   public MovieHandler(ArrayList<Movie> pelis){  
      this.movie=new Movie();
      this.pelis = pelis;
   }  
     
   @Override  
   public void startElement(String uri, String localName, String qName,  
         Attributes attributes) throws SAXException {  
        
      // Limpiamos la variable temporal.  
      valor=null;  
        
      // Si la etiqueta es movie leemos el atributo id  
      if(qName.equals("movie")){  
         id = attributes.getValue("id");  
   
      }  
   }  
     
   @Override  
   public void characters(char[] ch, int start, int length)  
         throws SAXException {  
      // Guardamos el texto en la variable temporal  
      valor = new String(ch,start,length);  
   }  
  
   @Override  
   public void endElement(String uri, String localName, String qName)  
         throws SAXException {  
      // Según la etiqueta guardamos el valor leido   
      // en una propiedad del objeto movie  
      if (qName.equals("titulo")){  
         titulo = valor;  
      }else if (qName.equals("anyo")){  
         anyo = valor;  
      }else if (qName.equals("descripcion")){  
         descripcion = valor;  

         pelis.add(new Movie(id, titulo, anyo, descripcion));
      }  
        
   }  
  
}  