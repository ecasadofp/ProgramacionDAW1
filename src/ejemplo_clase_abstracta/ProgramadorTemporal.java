package ejemplo_clase_abstracta;

import java.time.LocalDate;

public class ProgramadorTemporal extends Programador {

	private LocalDate fechaComienzoTemporalidad;

	public ProgramadorTemporal(LocalDate fechaInicioTemporalidad) {
		super();
		fechaComienzoTemporalidad = fechaInicioTemporalidad;
	}

	public ProgramadorTemporal(String nombre, String apellidos, int edad, String id, LocalDate fechaInicioTemporalidad) {
		super(nombre, apellidos, edad, id);
		fechaComienzoTemporalidad = fechaInicioTemporalidad;
	}

	public LocalDate getFechaComienzoTemporalidad() {
		return fechaComienzoTemporalidad;
	}

	public String toString() {

		return super.toString().concat(" Fecha comienzo Temporalidad: ")
				.concat(fechaComienzoTemporalidad.toString());
	}

	public double importeNomina() {
		return 30 * 35.60;
	}

}