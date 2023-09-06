package Maestro;


import ElementosDeHabitaciones.*;
import Soporte.Util;
import java.awt.Color.*;

public class Master {
	boolean estado = true;
	boolean electricidad = true;
	boolean tuberias = true;
	int presion;
	String pMensaje;
	String pArea;
	
	public void abrirPuerta() {
		estado = true;
		Puerta puerta = new Puerta();
		puerta.abrirse(estado);
	}
	
	public void cerrarPuerta() {
		estado = false;
		Puerta puerta = new Puerta();
		puerta.cerrarse(estado);
		
	}
	
	public void abrirVentana() {
		estado = true;
		ventana ventana = new ventana();
		ventana.abrirse(estado);
		
		
	}
	
	public void cerrarVentana() {
		estado = false;
		ventana ventana = new ventana();
		ventana.abrirse(estado);
		
	}
	
	public void encenderLuz() {
		estado = true;
		bombillo foco = new bombillo();
		foco.encerderse(estado, electricidad);	
		
		
	}
	
	public void apagarLuz() {
		estado = false;
		bombillo foco = new bombillo();
		foco.apagarse(estado);
		
	}
	

	public void abrirLlave() {
		estado = true;
		presion = 100;
		llave llav = new llave();
		llav.abrirse(estado, presion, tuberias);
		
		
	}
	
	public void cerrarLlave() {
		estado = false;
		llave llav = new llave();
		llav.cerrarse(estado);
		
	}
	
	public void limpiarHabitacion() {
		pMensaje = "Habitacion limpia"
		pArea = "Habitaciones"
		Color verde = Color.GREEN;
		Util.report(pMensaje, verde, pArea, false);
	}
	
	public void destaquear() {
		pMensaje = "tuberias destaqueadas"
		pArea = "Habitaciones"
		Color verde = Color.GREEN;
		Util.report(pMensaje, verde, pArea, false);
	}
	
	public void sacarAgua() {
		pMensaje = "Habitacion sin agua"
		pArea = "Habitaciones"
		Color verde = Color.GREEN;
		Util.report(pMensaje, verde, pArea, false );
	}
}
