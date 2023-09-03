package Patio;

import java.awt.Color;

import Control.Main;
import Soporte.Util;

public class Arbol {
	
	int alturaArbol;
	int cantidadFruto;
	int Humedad;
	int Cantidad;
	
	String[] Tipo = {"Pino","Roble","Palmera","Manzano"};
	
	
	public void crecerArbol() {
		
		alturaArbol += (int)(Math.random()*3);
		Util.report("EL arbol crecio a" + alturaArbol + "cm");
	}
		
	
	public void darFruto() {
		cantidadFruto += (int)(Math.random()*3);
		Util.report("EL arbol tiene" + cantidadFruto + "frutos");	
	}

}
