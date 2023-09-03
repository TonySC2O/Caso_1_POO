package Patio;

import java.awt.Color;

import Soporte.Util;

public class ManagerControlPatio {
	
	public void humedecerSuelo() {
		Util.report("Se ha humedecido el suelo", Color.cyan, "Patio", 7);
	}
	
	public void crecerCespedMucho() {
		Util.report("El cesped ha crecido", Color.green, "Patio", 5);
	}
	
	public void mandarPlagas(String plaga) {
		Util.report("Ha aparecido una plaga de " + plaga, new Color(200, 50, 30), "Patio", 4);
	}
	
	public void ensuciarPatio() {
		Util.report("Se ha ensuciado el patio", Color.gray, "Patio", 6);
	}
}
