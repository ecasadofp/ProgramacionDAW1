package ejemplo2SAX_VIEJO.ejemplo2SAX;

import java.io.FileInputStream;  
import java.io.IOException;  
  
import org.xml.sax.InputSource;  
import org.xml.sax.SAXException;  
import org.xml.sax.XMLReader;  
import org.xml.sax.helpers.XMLReaderFactory;  
  
/** 
 * Clase que procesa un XML de una movie mediante el handler SAX ManejadorMovie 
 *  
 * 
 */  
public class ProcesaMovie {  
  
   public static void main(String[] args) {  
        
      try {  
         // Creamos nuestro objeto Movie  
         Movie movie = new Movie();  
         // Creamos la factoria de parseadores por defecto  
         XMLReader reader = XMLReaderFactory.createXMLReader();  
         // A�adimos nuestro manejador al reader pasandole el objeto movie  
         reader.setContentHandler(new MovieHandler(movie));           
         // Procesamos el xml de ejemplo  
         reader.parse(new InputSource(new FileInputStream(".//movie_1.xml")));  
         // Ya tenemos nuestro objeto movie con los valores obtenidos del xml  
         // Lo imprimimos en el �ltimo elemento de cada movie  
         //System.out.println(movie.toString());           
      } catch (SAXException e) {  
         e.printStackTrace();  
      } catch (IOException e) {  
         e.printStackTrace();  
      }  
  
   }  
  
}  
