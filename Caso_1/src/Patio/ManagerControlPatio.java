package Patio;

import java.awt.Color;

import Soporte.Util;

public class ManagerControlPatio {
	
	String[] str_plagas = {"Saltamontes", "Osos", "Serpientes", "Gusanos", "Mapaches", "Coyotes"};
	String tipo_plaga = null ;
	
	//Estados patio
	
	boolean plaga = false;
	boolean sucio = false;
	
	//Metodos 
	
	public void humedecerSuelo() {
		Util.report("Se ha humedecido el suelo", Color.cyan, "Patio", 7, true);
	}
	
	public void crecerCespedMucho(){
		Util.report("El cesped ha crecido", Color.green, "Patio", 5, true);
	}
	
	public void mandarPlagas() {
		tipo_plaga = str_plagas[(int) (Math.random()*5)];
		Util.report("Ha aparecido una plaga de " + tipo_plaga, new Color(200, 50, 30), "Patio", 4, true);
		plaga = true;
	}
	
	public void ensuciarPatio() {
		Util.report("Se ha ensuciado el patio", Color.gray, "Patio", 6, true);
		sucio = true;
	}
}
   