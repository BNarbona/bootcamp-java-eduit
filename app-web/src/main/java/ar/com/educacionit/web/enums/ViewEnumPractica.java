package ar.com.educacionit.web.enums;

public class ViewEnumPractica {
	
	public static void main(String[] args) {
		
		/*String vista = getNextView();
		
		if(null == vista) {
		
		}else if("".equals(vista)) {
			
		}else {
			
		}
			
		// pero quiero asegurar un valor acotado, no quiero que me manden cualquier cosa
		
		}
		
		public static String getNextView() {
			return ""; // cadena puede ser "", null, "algo" queremos restrigir el algo
			
		}*/
	
	//listado.jsp
	//login.jsp
	//alta.jsp
	
	ViewsEnumPractica view = getViewEnum("alta");
	ViewsEnumPractica view1= getViewEnumByName("LISTADO");
	ViewsEnumPractica view2= getViewEnumByValue("lila");

	System.out.println(view);
	System.out.println(view1);	
	System.out.println(view2);
			
	}
		
	public static ViewsEnumPractica getViewEnum(String laVistaBuscada) {

		//lista -> ViewsEnum.LISTADO
		//login -> ViewsEnum.LOGIN
		//alta -> ViewsEnum.ALTA
		
		//lo puedo hacer asi, pero se haria muy largo si agrego mas opciones
		ViewsEnumPractica viewEnum;
		if("lista".equals(laVistaBuscada)) {
			viewEnum = ViewsEnumPractica.LISTADO;
		} else if("login".equals(laVistaBuscada)) {
			viewEnum = ViewsEnumPractica.LOGIN;
		} else if("alta".equals(laVistaBuscada)) {
			viewEnum = ViewsEnumPractica.ALTA;
		} else {
			viewEnum = null;
		}
		return viewEnum;
	}

	public static ViewsEnumPractica getViewEnumByName(String laVistaBuscada) {
		return ViewsEnumPractica.valueOf(laVistaBuscada);
	}
	
	public static ViewsEnumPractica getViewEnumByValue(String laVistaBuscada) {
		ViewsEnumPractica[] enums =ViewsEnumPractica.values();
		ViewsEnumPractica enumFinal = null;
		for(int i=0; enums[i]==null && i<enums.length; i++) {
			if(enums[i].getValue().equals(laVistaBuscada)){
				enumFinal = enums[i];
			}
		}	
		return enumFinal;	
	}

}
