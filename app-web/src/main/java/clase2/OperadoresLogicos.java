package clase2;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean esViernes = true;
		boolean tuCuerpoLoSabe = false;
		
		boolean resultado1 = esViernes&&tuCuerpoLoSabe;
		System.out.println(resultado1);	
		
		boolean resultado2 = esViernes||tuCuerpoLoSabe;
		System.out.println(resultado2);	
		
		boolean resultado3 = esViernes^!tuCuerpoLoSabe;
		System.out.println(resultado3);	
		
		boolean resultado4 = esViernes&&!tuCuerpoLoSabe;
		System.out.println(resultado4);	
		
	
	}

}
