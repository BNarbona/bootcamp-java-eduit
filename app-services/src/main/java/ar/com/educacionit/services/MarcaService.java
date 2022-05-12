package ar.com.educacionit.services;

import java.util.List;

import ar.com.educacionit.domain.Marca;
import ar.com.educacionit.services.exceptions.ServiceException;

public interface MarcaService {

	
	public Marca getById(Long id) throws ServiceException;
 	
	public void deleteMarca(Long id) throws ServiceException;
	
	public void updateMarca(Marca marca) throws ServiceException;
	
	public List<Marca> findAll() throws ServiceException;
	
	public void save(Marca nuevo) throws ServiceException;
}
