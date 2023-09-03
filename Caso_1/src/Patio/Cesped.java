package Patio;

import java.awt.Color;

import Control.Main;
import Soporte.Util;

public class Cesped {
	
	 int alturaCesped;
	 int Humedad;
	 int Extension;

	public void crecer() {
		alturaCesped += (int)(Math.random()*3);
	}
	
	public void cortar() {
		alturaCesped = 0;
	}
}
