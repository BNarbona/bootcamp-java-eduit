package clase12;

public class Auto {

	private Motor motor; 
	private Aleron aleron;
	
	public Auto() {	
		this.motor = new Motor(); // asi representaria una composicion, nace el objeto en el constructor. 
	}
	
	public void setAleron(Aleron aleron) { //con un setter hago una agregacion, lo puedo o no usar
		if(aleron!=null) {
			this.aleron = aleron;
		}
	}
}
