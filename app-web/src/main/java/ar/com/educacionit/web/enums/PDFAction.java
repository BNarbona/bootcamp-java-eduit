package ar.com.educacionit.web.enums;

import java.io.Serializable;
import java.util.Collection;

import ar.com.educacionit.domain.Articulo;

public class PDFAction implements IExportable {

	@Override
	public String exportar(Collection<Serializable> datos) {
		System.err.println("Convirtiendo a " + getClass().getCanonicalName());
		return null;
	}

}
