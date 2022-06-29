package ar.com.educacionit.web.enums;

public class FormatoMain {

	public static void main(String[] args) {
		
		String formato = "CSV";
		FormatoEnum fe = FormatoEnum.getByValue(formato); 
		IFormato action = ActionBuilder.getAction(fe);
		
		action.doAction();
		
	}

}
