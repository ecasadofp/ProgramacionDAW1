package ejemplosDOM;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CrearEmpleadosXMLincompleto {

	public static void main(String argv[]){
		try {
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  Document doc = db.newDocument();
	
			  // definimos el elemento ra�z del documento
			  Element eRaiz = doc.createElement("empleados");
			  doc.appendChild(eRaiz);
	
			  // definimos el nodo que contendr� los elementos
			  Element eEmpleado = doc.createElement("empleado");
			  eRaiz.appendChild(eEmpleado);
	
			  // atributo para el nodo empleado
			  Attr attr = doc.createAttribute("id");
			  attr.setValue("1");
			  eEmpleado.setAttributeNode(attr);
	
			  // definimos cada uno de los elementos y le asignamos un valor
			  Element eApellido = doc.createElement("apellido");
			  eApellido.appendChild(doc.createTextNode("Martinez"));
			  eEmpleado.appendChild(eApellido);
	
			//:TODO
			 
			  // clases necesarias finalizar la creaci�n del archivo XML
			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer = transformerFactory.newTransformer();
			  DOMSource source = new DOMSource(doc);
			  StreamResult result = new StreamResult(new File("ejemplosDOM/empleadosIncompleto.xml"));
	
			  transformer.transform(source, result);
			} catch(Exception e) {
			  e.printStackTrace();
		}
	}	
	
}
