package clase15;

public class ServiceTablaY extends Service <TablaY> {

	//protected IGenericOperation<TablaY> iTabla; lo quitamos porque lo heredo de Service 
	//para tablaX unicamente
	public ServiceTablaY() {
		super(new TablaYImpl());
	}
	
	public TablaY BuscarPorId(Long Id) {
		return this.iTabla.buscarPorId(Id);
	}
	
}