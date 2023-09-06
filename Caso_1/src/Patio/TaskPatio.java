package Patio;

import Soporte.ITask;
import Soporte.Action;


public class TaskPatio implements ITask {
	
	ManagerPatio manager = new ManagerPatio();
	
	
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
			manager.mandarPlagas();
		}
		if (pAction==Action.checkPatio) {
			manager.checkPatio();
		}
		if (pAction==Action.actPatio) {
			manager.actPatio();
		}
		
	}
}
