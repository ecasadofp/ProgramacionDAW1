package ejemplosDOM;



import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
public class LecturaEmpleadoXml {
	public static void main(String argv[]){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("ejemplosDOM/Empleados.xml"));
			document.getDocumentElement().normalize();
			System.out.println("Elemento raiz: " +
			       document.getDocumentElement().getNodeName());
			NodeList empleados = document.getElementsByTagName("empleado");
			
			for (int i=0;i<empleados.getLength(); i++) {
				Node emple = empleados.item(i);
				if (emple.getNodeType()== Node.ELEMENT_NODE){
					Element elemento = (Element) emple;
					System.out.println("ID: " + getNodo("id", elemento));
					System.out.println("Apellido: " + getNodo("apellido", elemento));
					System.out.println("Departamento: " + getNodo("dep", elemento));
					System.out.println("Salario: " + getNodo("salario", elemento));
				}
			}
			
		} catch (Exception e) {System.err.println("Error: " + e); }
	
	}
	private static String getNodo(String etiqueta, Element elem){
		NodeList nodo = elem.getElementsByTagName(etiqueta).item(0).getChildNodes();
		Node valornodo=  nodo.item(0);
		return valornodo.getNodeValue();

		/* Bastar�a una sola l�nea
		return elem.getElementsByTagName(etiqueta).item(0).getTextContent();*/

	}

}



