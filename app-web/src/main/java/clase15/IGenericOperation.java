package clase15;

public interface IGenericOperation <T> {

	public T crear();
	public void eliminar(Long id);
	public T buscarPorId(Long id);
}
