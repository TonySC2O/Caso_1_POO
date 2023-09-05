package Patio;
import Soporte.Util;
import java.awt.Color;

public class Planta {
	
	String[] Tipo = {"Margarita", "Rosa", "Cactus", "Diente de león"};
	int Humedad;
	int Cantidad;
	int Flores;
	int Frutos;
	
	public void florecer() {
		Flores =+ (int)(Math.random()*5);
		Util.report("La planta ha florecido " + Flores + " flores", Color.green, "Patio", 10, true);
	}
	
	public void darFruto() {
		Frutos =+ (int)(Math.random()*5);
		Util.report("La planta ha producido " + Frutos + " frutos", Color.cyan, "Patio", 10, true);
	}
	
	

}
