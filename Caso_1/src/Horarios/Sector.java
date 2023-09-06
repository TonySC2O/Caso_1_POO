package Horarios;

import java.util.ArrayList;

import plannerControl.Task;
import plannerControl.Clock;

public abstract class Sector {
	public ArrayList<String> tasks;
	
	public Sector() {
		tasks = new ArrayList<String>();
		loadMyTasks();
	}
	
	public void process(Task pTask) {
		for(String task : tasks) {
			
			if (
				task.compareTo(pTask.getTaskname())==0 &&
				!pTask.isProcesada() &&
				Clock.getSecondsToNow(pTask.getTasktime())<=
				Clock.getSecondsToNow(Clock.getTime())
				) 
			{
				
				pTask.setProcesada(true);
				
				System.out.println(this.getClass().toString()+" haciedo tarea "+pTask.getTaskname());
			}
		}
	}
	
	protected abstract void loadMyTasks();
}
