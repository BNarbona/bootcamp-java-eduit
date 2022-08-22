package clase13;

public class MainFormulario {

	//VER POR QUE IMPRIME UN ARRAY EN OPCION 3
	public static void main(String[] args) {
		//Opcion de formulario
		int op = 3; // 1-Legales 2=Cotrato

		Formulario f = FormularioBuilder.crearFormularios(op);
		String textoFinal = f.compilarEtiquetas();
		System.out.println(textoFinal);
		
	}

}
