package clase14;

public class Persona {

	private String nombre;
	private IIdioma idiomaNativo;
	private IIdioma [] masIdioma; 

	public void aprenderIdioma(IIdioma nuevoIdioma) {
		
	}
	
	public void decir(String algo) {
		if(algo!=null) {
		this.idiomaNativo.decir(algo);
		}
	}
	
	public void decir(String algo, IIdioma unIdioma) {
		IIdioma aux = null;
		
		if(!esMismoIdioma(this.idiomaNativo,unIdioma)) {
			for(int i=0; aux ==null && i<this.masIdioma.length; i++) {
				if(esMismoIdioma(this.masIdioma[i], unIdioma)) {
					aux = unIdioma;
				}
			}
		}
		else {
			
				
			}while();
		}
		this.decir(algo);
	}
	
	private boolean esMismoIdioma(IIdioma source, IIdioma target) {
		return(source.getClass().equals(target.getClass()));
		
	}
}
