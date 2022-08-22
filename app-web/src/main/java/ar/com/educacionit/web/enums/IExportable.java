package ar.com.educacionit.web.enums;

import java.io.Serializable;
import java.util.Collection;

import ar.com.educacionit.domain.Articulo;

public interface IExportable {

	public String exportar(Collection<Serializable> datos);
}
