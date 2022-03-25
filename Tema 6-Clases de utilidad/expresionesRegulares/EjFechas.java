package expresionesRegulares;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EjFechas {

	public static void main(String[] args) {

		Calendar ahora = new GregorianCalendar();
		
		// Menos del 15
		
		int diaActual = ahora.get(Calendar.DATE);
		
		if(diaActual < 15)
			System.out.println("No puedes sacar dinero");
		else
			System.out.println("Toma tu dinero");

		
//		System.out.println(ahora);

		SimpleDateFormat sdf = new SimpleDateFormat("'Día' dd 'del año' YYY '. Es el día ' DD ' del año y día de la semana' EEEE");
		
//		System.out.println("Fecha: " + sdf.format(ahora));
		
		Calendar sanLorenzo = new GregorianCalendar(2022, Calendar.AUGUST,3);
		
		sanLorenzo.set(Calendar.DATE, 10);
		
		
		System.out.println(sdf.format(sanLorenzo.getTime()));
		
		System.out.println(Calendar.YEAR);

	}

}
