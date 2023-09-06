package Maestro;

import Soporte.ITask;

public class ITaskHabitaciones {
	Master manager = new Master();
	
	public void execute(Action pAction, boolean esControl) {
		if(pAction==Action.abrirPuerta) {
			if(esControl) {manager.abrirPuerta();}
			else {System.out.println("Solo control puede abrir puertas");}
		}
		
		if(pAction==Action.cerrarPuerta) {
			if(esControl) {manager.cerrarPuerta();}
			else {System.out.println("Solo control puede cerrar puertas");}
		}
		
		if(pAction==Action.abrirVentana) {
			if(esControl) {manager.abrirVentana();}
			else {System.out.println("Solo control puede abrir Ventanas");}
		}
		if(pAction==Action.cerrarVentana) {
			if(esControl) {manager.cerrarVentana();}
			else {System.out.println("Solo control puede cerrar ventanas");}
		}
		
		if(pAction==Action.encenderLuz) {
			if(esControl) {manager.encenderLuz();}
			else {System.out.println("Solo control puede encender luces");}
		}
		
		if(pAction==Action.apagarLuz) {
			if(esControl) {manager.apagarLuz();}
			else {System.out.println("Solo control puede apagar luces");}
		}
		
		if(pAction==Action.abrirLlave) {
			if(esControl) {manager.abrirLlave();}
			else {System.out.println("Solo control puede abrir llaves");}
		}
		
		if(pAction==Action.cerrarLlave) {
			if(esControl) {manager.cerrarLlave();}
			else {System.out.println("Solo control puede cerrar llaves");}
		}
	}
}
