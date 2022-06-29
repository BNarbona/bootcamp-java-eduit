package ar.com.educacionit.web.enums;

public enum AttributesEnum {

	ARTICULOS("articulos")
	;
	
	private String value;
	
	private AttributesEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}

