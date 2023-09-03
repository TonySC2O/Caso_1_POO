package Patio;

import java.awt.Color;

import Control.Main;
import Soporte.Util;

public class ManagerPatio extends ManagerControlPatio{
	

	public void eliminarPlagas() {
		Util.report("Se han eliminado las plagas", Main.color_suelo, "Patio", 4, true);
	}
}
