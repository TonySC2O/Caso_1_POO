package Horarios;

public class SectorControl extends Sector{
	
	@Override
	protected void loadMyTasks() {
		tasks.add("Ensuciar habitación");
		tasks.add("Generar plaga");
		tasks.add("Cortar agua");
		tasks.add("Acabar pesticida");
	}
}
