package Patio;

import java.awt.Color;

import Control.Main;
import Soporte.Util;

public class Cesped {
	
	 int alturaCesped;
	 int Humedad;
	 int Extension;

	public void crecerCesped() {
		alturaCesped += (int)(Math.random()*3);
		////Util.report("EL cesped crecio a" + alturaArbol + "cm");
	}
}
