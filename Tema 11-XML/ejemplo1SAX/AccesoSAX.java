package ejemplo1SAX;
import javax.xml.parsers.*;
import org.xml.sax.*;
import java.io.File;
import java.io.IOException;


public class AccesoSAX  {

	public static void main(String[] args) {

		SAXParserFactory spf = SAXParserFactory.newInstance();
		File archivo  = new File("src/desayunosEuros.xml");
		try {
			SAXParser sp = spf.newSAXParser();
			sp.parse(archivo, new EscuchadorSAX());
			
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
