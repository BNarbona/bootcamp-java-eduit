package ar.com.educacionit.services.impl;

import java.util.List;

import ar.com.educacionit.daos.GenericDao;
import ar.com.educacionit.daos.db.exceptions.DuplicatedException;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.JDBCBaseDaoImpl;
import ar.com.educacionit.services.GenericService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class AbstractBaseService <T> implements GenericService<T>{

	protected GenericDao<T> dao;

	public AbstractBaseService(GenericDao<T> dao) {
		this.dao = dao;
	}
	
	public T getById(Long id) throws ServiceException {
		try {
			return dao.getByPK(id);
		} catch (GenericException e) {			
			throw new ServiceException("Error al consultar entity",e);
		}
	}

	public List <T> findAll() throws ServiceException {
		try {
			return dao.findAll();
		} catch (GenericException e) {			
			throw new ServiceException("Error al consutlar los articulos",e);
		}
	}
	
	public void delete(Long id) throws ServiceException {
		try {
			dao.delete(id);
		} catch (GenericException e) {			
			throw new ServiceException("Error al eliminar el articulo",e);
		}				
	}

	public void update(T entity) throws ServiceException {
			try {
				dao.update(entity);
			} catch (GenericException e) {
				throw new ServiceException("Error al actualizar el articulo",e);
			}				
	}
	
	public void save(T nuevo) throws ServiceException {
		try {
			dao.save(nuevo);
		} catch (GenericException | DuplicatedException e) {
			throw new ServiceException("Error al actualizar el articulo",e);
		}
	}
	
}
