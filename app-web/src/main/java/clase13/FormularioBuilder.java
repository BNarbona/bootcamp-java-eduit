package clase13;

public class FormularioBuilder {

	public static Formulario crearFormularios(int op) {
		
		Formulario f;
		switch(op){
			
		case 1:
			f = new FormularioLegales("Legales");
			break;
		case 2:
			f = new FormularioContrato("Contrato");
			break;
			
		default:
			f = new FormularioContrato("Crato");
			break;	
		}
		f.definirEtiquetas();
		return f;
		
	}
	
}
