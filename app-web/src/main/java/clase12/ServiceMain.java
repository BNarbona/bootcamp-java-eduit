package clase12;

public class ServiceMain {

	public static void main(String[] args) {
		
		String sitio = "1";

		//creo mi servicio
		
		//como el metodo es estatico, entonces lo llamo desde la clase
		IService service = ServiceBuilder.builderService(sitio);
		
		Dato dato = service.consultar();
		
		dato.detalle();
		IFormateable f1 = new FormatoPDF(dato);
		IFormateable f2 = new FormatoHTML(dato);
		
		f1.formatear();
		f2.formatear();
	}

}
