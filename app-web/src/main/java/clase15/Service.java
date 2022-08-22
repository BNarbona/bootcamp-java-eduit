package clase15;

public abstract class Service <T>{ 

	// no lo vamos a usar, sino tendriamos uqe hacer un servicio para TablaXimpl y otro para TablaYImpl
	protected IGenericOperation<T> iTabla;
	
	public Service(IGenericOperation<T> iTabla) {
		this.iTabla = iTabla;
	}
}
