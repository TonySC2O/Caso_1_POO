package Patio;

import Soporte.ITask;
import Soporte.Action;


public class TaskPatio implements ITask {
	
	ManagerPatio manager = new ManagerPatio();
	String[] plagas = {"Saltamontes", "Osos", "Serpientes", "Gusanos", "Mapaches", "Coyotes"};
	
	@Override
	public void execute(Action pAction) {
		if (pAction==Action.crecerCespedMucho) {
			manager.crecerCespedMucho();
		}
		if (pAction==Action.humedecerSuelo) {
			manager.humedecerSuelo();
		}
		if (pAction==Action.ensuciarPatio) {
			manager.ensuciarPatio();
		}
		if (pAction==Action.mandarPlagas) {
			manager.mandarPlagas(plagas[(int) (Math.random()*5)]);
		}
		if (pAction==Action.eliminarPlaga) {
			manager.eliminarPlagas();
		}
	}
}
