package Control;

import Patio.TaskPatio;
import Soporte.Action;

public class PruebaPatio extends Prueba{
	
	TaskPatio tareasPatio = new TaskPatio();
	
    public

        void generarPlaga(){
    		tareasPatio.execute(Action.mandarPlagas);
        }

        void crecerCesped(){
        	tareasPatio.execute(Action.crecerCespedMucho);
        }

        void ensuciarPatio(){
        	tareasPatio.execute(Action.ensuciarPatio);
        }

        void humedecerSuelo(){
        	tareasPatio.execute(Action.humedecerSuelo);
        }
}
