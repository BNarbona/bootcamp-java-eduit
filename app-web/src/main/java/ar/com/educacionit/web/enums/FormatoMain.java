package ar.com.educacionit.web.enums;

public class FormatoMain {

	public static void main(String[] args) {
		
		String formato = "CSV";
		FormatoEnum fe = FormatoEnum.getByValue(formato); 
		IExportable action = ActionBuilder.getAction(fe);
		
		action.exportar(null);
		
	}

}
