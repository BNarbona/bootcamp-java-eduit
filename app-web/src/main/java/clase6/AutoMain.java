package clase6;

public class AutoMain {

	public static void main(String[] args) {
	
		Auto miAuto = new Auto ("Ford", "Ka", 2010);
		Auto miAuto1= new Auto ();
		
		
		//miAuto.anio = 2020;
		//miAuto.marca = "Renualt";
		//miAuto.modelo = "Clio";
		//miAuto.velocidad = 0f;
		
		miAuto.encender();
		miAuto.encender();
		
		miAuto1.encender();
		
		miAuto = null; //lo elimino asi
	}

}
