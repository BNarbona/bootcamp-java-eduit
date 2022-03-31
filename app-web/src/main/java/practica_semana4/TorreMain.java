package practica_semana4;

public class TorreMain {

	public static void main(String[] args) {
		
		Torre torreA= new Torre();
		
		Volador [] voladoresHoy; 
		voladoresHoy = torreA.ingresoVoladores();
		
		for(Volador v : voladoresHoy) {
			if(v instanceof Aterrizable) {			
				System.out.println("DATOS DEL VOLADOR");
				v.obtenerDatos(); 
				System.out.println("\nTorre de control autoriza el aterrizaje");
				((Aterrizable) v).aterrizar(); //ejecuto metodo aterrizar de cada volador
				
			}
			else {
				System.out.println(v.getNombre()+" : No está autorizado para aterrizar\n");
			}
			
		}
		
	}

}
