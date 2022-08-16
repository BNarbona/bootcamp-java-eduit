package ar.com.educacionit.web.enums;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import ar.com.educacionit.domain.Articulo;

public class PDFAction implements IExportable {

	@Override
	public String exportar(Collection<Serializable> datos) {
		Map<String,String> params = new HashMap<>();
		params.put("USERNAME", "BRENDA");
		
		return null;
	}

}
