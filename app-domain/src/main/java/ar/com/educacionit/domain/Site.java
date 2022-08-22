package ar.com.educacionit.domain;

public class Site implements Entity{

	private Long id;
	private String code; //Corrresponde al id del DTO
	private String name;


	public Site(Long id, String code, String name) {
		this.id = id;
		this.name = name;
		this.code = code;
	}
	
	


	public Site(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}




	public Site(String name) {
		this.name = name;
	}

	@Override
	public Long getId() {
		return this.id;
	}
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Site [id=" + id + ", code=" + code + ", name=" + name + "]";
	}
	
	

}