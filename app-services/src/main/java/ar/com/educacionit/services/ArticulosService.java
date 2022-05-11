package ar.com.educacionit.services;

import java.util.List;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.exceptions.ServiceException;

public interface ArticulosService {

	/**
	 * Obtiene un articulo dado su id=PK 
	 * @return
	 * @throws ServiceException 
	 */
	
	public Articulo getByCode(String code) throws ServiceException;
	
	public Articulo getById(Long id) throws ServiceException;
 	
	public void deleteArticulo(Long id) throws ServiceException;
	
	public void updateArticulo(Articulo articulo) throws ServiceException;
	
	public List<Articulo> findAll() throws ServiceException;
	
	public void save(Articulo nuevo) throws ServiceException;
}
