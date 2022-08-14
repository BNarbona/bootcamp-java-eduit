package ar.com.educacionit.web.enums;

public enum ViewsEnum {
	
	LISTADO("/views/listado.jsp"),
	REGISTRO_OK("/registroOk.jsp"),
	REGISTRO_FAIL("/registroFail.jsp"),
	LISTADO_CONTROLLER("/controller/ListadoController"),
	UPLOAD_PREVIEW("/views/preview.jsp"), 
	UPLOAD("/views/upload.jsp");
	
	private String value;
	
	private ViewsEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
