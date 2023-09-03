package Patio;

import java.awt.Color;

import Control.Main;
import Soporte.Util;

	
public class ManagerPatio extends ManagerControlPatio{

	Cesped cesped = new Cesped();
	Arbol arbol = new Arbol();
	
	//Patio General
	public void eliminarPlagas() {
		if (plaga = false){
			//Util.report("No hay plaga que eliminar", Main.color_suelo, "Patio", 4, true);
		} 
		else{
			plaga = false;
			//Util.report("Se ha eliminado la plaga de " + tipo_plaga, Main.color_suelo, "Patio", 4, true);
		}
	}
	
	public void limpiarPatio() {
		if (sucio = false){
			//Util.report("El patio no esta sucio", Main.color_suelo, "Patio", 4, true);
		} 
		else{
			//Util.report("Se ha limpiado el patio", Main.color_suelo, "Patio", 4, true);
			sucio = false;
		}
	}

	 //Cesped
	public void cortarCesped() {
		cesped.cortar();
		//Util.report("El cesped ha sido cortado", Main.color_suelo, "Patio", 4, true);
	}
		
	public void crecerCesped() {
		cesped.crecer();
		//Util.report("El cesped ha crecido", Main.color_suelo, "Patio", 4, true);
	}
	
	//Arbol

	public void crecerArbol() {
		arbol.crecer();
		//Util.report("El arbol ha crecido", Main.color_suelo, "Patio", 4, true);
	}
	
	public void arbolDarFruto() {
		arbol.darFruto();
		//Util.report("El arbol a dado fruto", Main.color_suelo, "Patio", 4, true);
	}
	
}