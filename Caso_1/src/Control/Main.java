package Control;

import java.awt.Color;

import javax.swing.SwingUtilities;

import GUI.Window;
import Patio.TaskPatio;
import Soporte.Action;
import plannerControl.*;

public class Main {
	
	public static Color color_verde = new Color(0,160,50);
	public static Color color_suelo = new Color(170,115,30);
	public static Color color_casa = new Color(200,250,230);
	public static Window frame = new Window();

public static void main(String args[]) {
	
	
	SwingUtilities.invokeLater(() -> {
        frame.setVisible(true);
        TaskPatio tareasPatio = new TaskPatio();
	    tareasPatio.execute(Action.mandarPlagas);
        
    });
	
}

}
