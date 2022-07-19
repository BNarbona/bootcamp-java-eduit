package ar.com.educacionit.web.enums;

public enum AttributesEnum {

	ARTICULOS("articulos"),
	EXITO("Exito"),
	ERROR_GENERAL("Error"),
	;
	
	private String value;
	
	private AttributesEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}

