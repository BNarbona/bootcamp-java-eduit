package ar.com.educacionit.services;

import java.util.List;

import ar.com.educacionit.domain.Categoria;
import ar.com.educacionit.services.exceptions.ServiceException;

public interface CategoriaService {

	
	public Categoria getById(Long id) throws ServiceException;
 	
	public void deleteCategoria(Long id) throws ServiceException;
	
	public void updateCategoria(Categoria categoria) throws ServiceException;
	
	public List<Categoria> findAll() throws ServiceException;
	
	public void save(Categoria nuevo) throws ServiceException;
}
