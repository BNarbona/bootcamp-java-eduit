package ar.com.educacionit.services;

import java.util.List;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.exceptions.ServiceException;

public interface ArticulosService extends GenericService<Articulo> {

	public Articulo getByCode(String code) throws ServiceException;
	
}
