package expresionesRegulares;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class PruebaMail {

	public static void main(String[] args) {

		String correo = "_e-nr_iq3ue.santos.casado@fppiramide.com";
		System.out.println("El correo " + correo + (esMailValido(correo)?(" es válido"):(" no es válido")));

	}
	
	public static boolean esMailValido(String mail) {
		
		Pattern pt = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mt = pt.matcher(mail);
		
		return mt.matches();
	
	}

}
