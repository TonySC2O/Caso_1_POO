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
	
	
	public void crecer() {
		alturaArbol += (int)(Math.random()*3);
	}
		
	
	public void darFruto() {
		cantidadFruto += (int)(Math.random()*3);
	}

}
