package file;
import java.io.File;
import java.util.Date;

public class EjFile {

	public static void main(String[] args) {
		
		String strFichero = "mifichero.txt";
		String strDirectorio = "midirectorio";
		String strRuta = File.separator + strDirectorio + File.separator + strFichero;
		System.out.println(strRuta);

		
		String so = System.getProperty("os.name");
		String arch = System.getProperty("os.arch");
		String separador = System.getProperty("file.separator");
		String strRuta2 = separador + strDirectorio + separador + strFichero;
		System.out.println(strRuta2);
		System.out.println(so);
		System.out.println(arch);

		
		String directorio;
		
		if(args.length > 0)
			directorio = args[0];
		else
			directorio = ".";
		
		File actual = new File (directorio);
		
		System.out.print("El directorio actual es: ");
		try {
			
			System.out.println(actual.getAbsolutePath());
			
		}catch(SecurityException e){
		}
		
		File[] archivos = actual.listFiles();
		
		for(File archivo : archivos) {
			
			if(archivo.isFile()) {
				
				System.out.println("Nombre: " + archivo.getName());
				System.out.println("Longitud en bytes: " + archivo.length());
				System.out.println("Modificado: " + new Date(archivo.lastModified()));
				System.out.println("Ruta: " + archivo.getPath());
				System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
				System.out.println("Se puede escribir: " + archivo.canWrite());
				System.out.println("Se puede leer: " + archivo.canRead());
								
			}
			System.out.println();
		}
	}
}

