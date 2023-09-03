package Control;

import javax.swing.SwingUtilities;

import GUI.Window;
import Patio.TaskPatio;
import Soporte.Action;

public class Main {
	
	public static Window frame = new Window();

public static void main(String args[]) {
		
		SwingUtilities.invokeLater(() -> {
	        frame.setVisible(true);
	        TaskPatio tareasPatio = new TaskPatio();
	        tareasPatio.execute(Action.mandarPlagas);
	        
	    });
	}

}
