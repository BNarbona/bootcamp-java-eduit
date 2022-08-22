package clase6;

public class Auto {

	// atributos
	String marca;
	float velocidad;
	String modelo;
	int anio;
	boolean encendido;
	
	//constructor parametrizado
	
	Auto (String marcadenac, String modelodenac, int aniodenac){
		marca = marcadenac;
		modelo = modelodenac;
		anio = aniodenac;
		//luego indico los por defecto
		encendido = false;
		velocidad = 0f;
	}
	
	Auto(){
		encendido = false;
		velocidad = 0f;
	}
	
	void encender() {
		if(!encendido) {
			encendido=true;
			System.out.println("Se ha encendido el auto");
		}
		else {
			System.out.println("El auto ya está encendido");
		}
	}
	
	void apagar() {
		if(encendido) {
			while(velocidad>0) {
				frenar();
			}
			
			encendido=false;
			System.out.println("Se ha apagado el auto");
		} else {
			System.out.println("El auto ya está apagado");
		}
		
	}

	public void acelerar() {
		if(encendido) {
			velocidad++;
			System.out.println("Acelerando");
		} else {
			System.out.println("El auto esta apagado");
		}
	}
	
	void frenar() {
		if(encendido) {
			if(velocidad>0) {
				velocidad--;
			}else {
				System.out.println("El auto esta detenido");
			}
		} else {
			System.out.println("El auto esta apagado");
		}
	}
	
}
