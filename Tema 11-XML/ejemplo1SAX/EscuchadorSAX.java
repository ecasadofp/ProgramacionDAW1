package ejemplo1SAX;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.*;

public class EscuchadorSAX extends DefaultHandler{
	
	StringBuffer auxTexto;

	public EscuchadorSAX() {
		
		auxTexto= new StringBuffer();
		
	}
	
	@Override
	public void startDocument() {
		
		System.out.println("Comienza la lectura del documento\n");
		
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) {
		
		System.out.println("Etiqueta encontrada: <"+qName+">");
		
	}
	@Override
	public void characters(char[] ch, int start, int length) {
		
		auxTexto.append(ch,start,length);

		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) {
		if(auxTexto.toString().trim().length()>0)
		System.out.println("Contiene el texto: "+auxTexto.toString().trim());
		System.out.println("Cierre de etiqueta encontrada: </"+qName+">\n");
		auxTexto.setLength(0);
	}
	
	
	@Override
	public void endDocument() {
		
		System.out.println("El documento ha sido procesado completamente");
		
	}

}
