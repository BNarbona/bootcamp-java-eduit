package clase15;

public class MainGenericTable {

	public static void main(String[] args) {
		
		ServiceTablaX sx = new ServiceTablaX();
		TablaX tx = sx.BuscarPorId(1L);

		ServiceTablaY sy = new ServiceTablaY();
		TablaY ty = sy.BuscarPorId(2L);
		
	}

}
