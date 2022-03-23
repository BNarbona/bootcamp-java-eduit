package clase6;

public class Calculadora {
   // armar bien la calculadora - tarea 
	double valor1;
	double valor2;
	double resultado;
	String op;
	
	Calculadora (double valor1, double valor2, String op){
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.op = op;
		resultado = 0;
	}
	
	
	void sumar() {
		resultado = valor1 + valor2; 
		System.out.println("El resultado es: "+resultado);
	}
	
	void restar(){
		resultado = valor1 - valor2; 
	}
	
		
	
}
