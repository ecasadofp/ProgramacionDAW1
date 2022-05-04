package ejemplo2SAX;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class ProcesaMovie {

	public static void main(String[] args) {

		ArrayList<Movie> pelis = new ArrayList<>();
		
		File archivo = new File("ejemplo2SAX/src/movie_1.xml");
		SAXParserFactory spf = SAXParserFactory.newInstance();
			
		
		try {
			
			SAXParser sp = spf.newSAXParser();
			sp.parse(archivo, new MovieHandler(pelis));
			
		} catch (ParserConfigurationException | SAXException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for(Movie peli:pelis)
			System.out.println(peli);
		
	}

}
