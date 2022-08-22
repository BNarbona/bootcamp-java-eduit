package clase12;

public class FormatoHTML extends FormatoBase implements IFormateable {

	
	public FormatoHTML(Dato dato) {
		super(dato);
		
	}
	
	@Override
	public void formatear() {
		System.out.println("Formateando un HTML");
		}

}

