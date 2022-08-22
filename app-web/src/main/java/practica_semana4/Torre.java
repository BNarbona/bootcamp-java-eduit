package practica_semana4;

public class Torre {

	public Volador[] ingresoVoladores(){
	
	Volador[] voladores = new Volador[5]; //genero una lista de los voladores 

	voladores[0] = new Avion ("Hercules", 1001, 120);
	voladores[1] = new Helicoptero ("Atlas",1222,"AT20","Utilitario");
	voladores[2] = new Helicoptero ("Axis",1223,"AT50","Sanitario");
	voladores[3] = new Ovni ("Ovnitator",9870,"OvniJ900");
	voladores[4] = new Superman ("Superman Kent",1515,"rojo");
	
	return voladores; 
			
	}
	
}

