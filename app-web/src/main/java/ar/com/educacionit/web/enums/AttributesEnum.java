package ar.com.educacionit.web.enums;

public enum AttributesEnum {

	ARTICULOS("articulos"),
	EXITO("Exito"),
	ERROR_GENERAL("Error"),
	UPLOAD_PREVIEW_KEY("Upload_key"), 
	ARTICULOS_OKS("Articulos_Oks"), 
	ARTICULOS_FAILS("Articulos_Fail"),
	;
	
	private String value;
	
	private AttributesEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}

