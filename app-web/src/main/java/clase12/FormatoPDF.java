package clase12;

public class FormatoPDF extends FormatoBase implements IFormateable {

	
	public FormatoPDF(Dato dato) {
		super(dato);
		
	}
	
	@Override
	public void formatear() {
		System.out.println("Formateando un PDF");
		}

}

