package clase6;

public class AutoMain2 {

	public static void main(String[] args) {
	
		Auto miAuto = new Auto();
		
		miAuto.anio = 2020;
		miAuto.marca = "Renualt";
		miAuto.modelo = "Clio";
		miAuto.velocidad = 0f;
		
		miAuto.encender();
		miAuto.acelerar();
		miAuto.acelerar();
		miAuto.apagar();
		
		
		
	}

}
