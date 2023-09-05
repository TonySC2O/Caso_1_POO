package Habitaciones;

public class Master {
	boolean estado = true;
	boolean electricidad = true;
	boolean tuberias = true;
	int presion;
	
	
	public void abrirPuerta() {
		estado = true;
		Puerta puerta = new Puerta();
		puerta.abrirse(estado);
	}
	
	public void cerrarPuerta() {
		estado = false;
		Puerta puerta = new Puerta();
		puerta.cerrarse(estado);
		
	}
	
	public void abrirVentana() {
		estado = true;
		ventana ventana = new ventana();
		ventana.abrirse(estado);
		
		
	}
	
	public void cerrarVentana() {
		estado = false;
		ventana ventana = new ventana();
		ventana.abrirse(estado);
		
	}
	
	public void encenderLuz(boolean pElectricidad) {
		estado = true;
		electricidad = pElectricidad;
		bombillo foco = new bombillo();
		foco.encerderse(estado, electricidad);	
		
		
	}
	
	public void apagarLuz() {
		estado = false;
		bombillo foco = new bombillo();
		foco.apagarse(estado);
		
	}
	

	public void abrirLlave(boolean pTuberias) {
		estado = true;
		tuberias = pTuberias;
		presion = 100;
		llave llav = new llave();
		llav.abrirse(estado, presion, tuberias);
		
		
	}
	
	public void cerrarLlave() {
		estado = false;
		llave llav = new llave();
		llav.cerrarse(estado);
		
	}
}
