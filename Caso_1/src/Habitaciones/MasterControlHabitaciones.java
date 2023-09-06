package Maestro;

import Soporte.Util;
import java.awt.Color.*;


public class MasterControlHabitaciones {
	String pMensaje;
	String pArea;
	
	public void ensuciarHabitacion() {
		pMensaje = "Habitacion sucia"
		pArea = "Habitaciones"
		Color verde = Color.RED;
		report(pMensaje, verde, pArea, true );
		Util.report("Habitacion sucia");
	}
	
	public void taquearTuberias() {
		pMensaje = "Tuberias taqueadas"
		pArea = "Habitaciones"
		Color verde = Color.RED;
		report(pMensaje, verde, pArea, true );
		Util.report("Tuberias taqueadas");
		
	}
	
	public void inundar() {
		pMensaje = "Habitacion inundada"
		pArea = "Habitaciones"
		Color verde = Color.RED;
		report(pMensaje, verde, pArea, true );
		Util.report("Habitacion inundada");
	}
}
