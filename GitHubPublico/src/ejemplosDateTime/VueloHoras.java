package ejemplosDateTime;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class VueloHoras {

	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");

		// Salida de San Francisco el 20 de julio de 2013, a las 7:30 p.m.
		LocalDateTime leaving = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
		ZoneId leavingZone = ZoneId.of("America/Los_Angeles"); 
		ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);

		try {
		    String out1 = departure.format(format);
		    System.out.printf("Partida:  %s (%s)%n", out1, leavingZone);
		} catch (DateTimeException exc) {
		    System.out.printf("%s no ha sido posible dar formato%n", departure);
		    throw exc;
		}

		// El vuelo dura  10 horas y 50 minutos, o 650 minutos
		ZoneId arrivingZone = ZoneId.of("Asia/Tokyo"); 
		ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone)
		                                 .plusMinutes(650);

		try {
		    String out2 = arrival.format(format);
		    System.out.printf("LLegada: %s (%s)%n", out2, arrivingZone);
		} catch (DateTimeException exc) {
		    System.out.printf("%s no ha sido posible dar formato%n", arrival);
		    throw exc;
		}

		if (arrivingZone.getRules().isDaylightSavings(arrival.toInstant())) 
		    System.out.printf("(%s horario de invierno.)%n",
		                      arrivingZone);
		else
		    System.out.printf("(%s horario de verano.)%n",
		                      arrivingZone);

	}

}
