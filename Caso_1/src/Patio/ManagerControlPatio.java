package Patio;

import java.awt.Color;

import Soporte.Util;

public class ManagerControlPatio {
	
	public void humedecerSuelo() {
		Util.report("Se ha humedecido el suelo", Color.gray, "Patio", 7);
	}
	
	public void crecerCespedMucho() {
		Util.report("El cesped ha crecido", Color.gray, "Patio", 5);
	}
	
	public void mandarPlagas(String plaga) {
		Util.report("Ha aparecido una plaga de " + plaga, Color.gray, "Patio", 4);
	}
	
	public void ensuciarPatio() {
		Util.report("Se ha ensuciado el patio", Color.gray, "Patio", 6);
	}
}
