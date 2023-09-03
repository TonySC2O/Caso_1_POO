package Soporte;

import java.awt.Color;
import Control.Main;

public class Util {
	public static void report(String pProblema, Color pColor, String pArea, int pIndex) {
		
		String aviso = "====================\n"+
						"HORA\n" +
						pArea + " - " + pProblema;
		
		System.out.println(pProblema + " en " + pArea);
		
		switch(pIndex) {
			case 1:
				
			case 2:

			case 3:

			case 4:
				Main.frame.AsignarEstado(7, pColor, false, aviso);
				break;
			case 5:
				Main.frame.AsignarEstado(8, pColor, false, aviso);
				break;
			case 6:
				Main.frame.AsignarEstado(7, pColor, false, aviso);
				break;
			case 7:
				Main.frame.AsignarEstado(7, pColor, false, aviso);
				break;
			case 8:

			case 9:

			case 10:

			case 11:

			case 12:

			case 13:

			case 14:

			case 15:
			
		}
	}
}
