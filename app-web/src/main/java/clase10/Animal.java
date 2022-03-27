package clase10;

public class Animal {

	// atributos
	//encapsulamos: ocultamos al resto este atributo con private
	protected String color;
	//private String especie;
	private Integer edad;
	
	//constructor: forma de nacer
	// la jdk me da un constructor por defecto(vacio)
	// si quiero implementar el mio, creo uno con public Animal().. asi anulo el de la jdk
	
	/*public Animal() {
		System.out.println("Nace un animal");
	}*/
	
	//este constructor, 
	public Animal(String color) {
		System.out.println("Nace un animal");
	}
	
	//metodos
	public void hablar() {
		System.out.println("Animal hablando");
	}
	
	//getter: obtengo valor del atributo
	//no tiene parametros
	
	public String getColor() {
		String color; // este es local
		if(this.color == null) { //this.color-> hace referencia a la clase
			color = "N/D";
		} else {
			color=this.color;
		}
		return color;
	}
	
	public void setColor(String nuevoColor) {
		if(color!=null) {
			this.color = nuevoColor;
		}else {
			System.err.println("Debe informar un color");
		}
	}
	
	//setter: modifico el valor
	
	public void setEdad (Integer nuevaEdad) {
		if(nuevaEdad!=null) {
			this.edad=nuevaEdad;
		}
	}
	
	public Integer getEdad() {
		return this.edad != null ? edad : 0;
	}
}
