package clase20;

public class Vendedor {

	private Long id;
	private String nombre;
	private Integer sucursal;
	
	
	public Vendedor ( String siguienteLinea) {
		//control
		if(siguienteLinea != null) {
			String [] arrayVendedor = siguienteLinea.split("\\|");
		
			if(arrayVendedor.length == 3) {
				//id
				this.setId(arrayVendedor[0]);
				this.setNombre(arrayVendedor[1]);
				this.setSucursal(arrayVendedor[2]);
			} 
			
		}
	}
	


	private void setId (String idStr) {
		if(idStr != null && !idStr.isBlank()) {
			this.id = Long.parseLong(idStr);
		} else {
			//generar una excepcion
			System.err.println("Invalidad id_vendor");
		}
		
	}
	

	private void setNombre(String nombre) {
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre.toUpperCase();
		} else {
			//generar una excepcion
			System.err.println("Invalidad name_vendor");
		}
		
	}
	
	private void setSucursal(String sucStr) {
		if(sucStr != null && !sucStr.isBlank()) {
			this.sucursal = Integer.parseInt(sucStr);
		} else {
			//generar una excepcion
			System.err.println("Invalidad suc_vendor");
		}
		
	}



	public Long getId() {
		return id;
	}



	public String getNombre() {
		return nombre;
	}



	public Integer getSucursal() {
		return sucursal;
	}



	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", nombre=" + nombre + ", sucursal=" + sucursal + "]";
	}
	
	
	
	
	
	/*public Vendedor(Long id, String nombre, int sucursal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sucursal = sucursal;
	}*/
	
	
	
}
