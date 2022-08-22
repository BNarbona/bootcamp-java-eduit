package clase15;

public class ServiceTablaX extends Service <TablaX>{

	//private IGenericOperation<TablaX> iTabla; lo saco porque extiendo de Service, lo creo ahi
	//para tablaX unicamente
	public ServiceTablaX() {
		super(new TablaXImpl());
		
	}
	
	public TablaX BuscarPorId(Long Id) {
		return this.iTabla.buscarPorId(Id);
	}
	
}