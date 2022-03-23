package clase5;

public class MinimoMain2 {

	public static void main(String[] args) {
		
		int [] edades = {36,40,28,24,17,17,17,30,6};
		
		
		if(edades.length!=0) {
			int minimo = edades[0];
			int maximo = edades[0];
			int posmin = 0;
			int posmax = 0;
			int cantmin=0;
			int cantmax=0;
			
			for(int i=0;i<edades.length;i++) {
				if (edades[i]<minimo) {
					minimo=edades[i];
					//posmin=i;
					cantmin=0;
				}
				if(edades[i]==minimo) {
						cantmin++;
				}
					
				
				if(edades[i]>maximo) {
					maximo = edades[i];
					posmax=i;
				}
			}	
			//System.out.println("El mimimo es: "+minimo+" y está en la posicion "+posmin);
			System.out.println("El mimimo es: "+minimo+" y hay "+cantmin+" minimos");
			System.out.println("El maximo es: "+maximo+" y está en la posicion "+posmax);
			
		} else {
			System.out.println("No hay edades");
		}

	}

}
