package ar.com.educacionit.web.enums;

public enum ViewsEnumPractica {
	//valores posibles (en mayuscula)-- CLAVES,
	LISTADO("list"),
	LOGIN("login"),
	ALTA("alta");

	private String value;
	
	private ViewsEnumPractica(String value) {
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
} 

}
