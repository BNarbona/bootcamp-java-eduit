package ar.com.educacionit.services.impl;

import java.util.List;

import ar.com.educacionit.daos.ArticuloDao;
import ar.com.educacionit.daos.db.exceptions.DuplicatedException;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.ArticuloDaoMysqlImpl;
import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class ArticulosServiceImpl implements ArticulosService {

	private ArticuloDao dao;
	
	public ArticulosServiceImpl() {

		this.dao = new ArticuloDaoMysqlImpl();
	}
	
	@Override
	public Articulo getById(Long id) throws ServiceException {
		try {
			return dao.getByPK(id);
		} catch (GenericException e) {			
			throw new ServiceException("Error al consutlar articulo",e);
		}
	}

	
	public List <Articulo> findAll() throws ServiceException {
		try {
			return dao.findAll();
		} catch (GenericException e) {			
			throw new ServiceException("Error al consutlar los articulos",e);
		}
	}
	
	@Override
	public void deleteArticulo(Long id) throws ServiceException {
		try {
			dao.delete(id);
		} catch (GenericException e) {			
			throw new ServiceException("Error al eliminar el articulo",e);
		}				
	}

	public void updateArticulo(Articulo articulo) throws ServiceException {
			try {
				dao.update(articulo);
			} catch (GenericException e) {
				throw new ServiceException("Error al actualizar el articulo",e);
			}				
	}
	
	@Override
	public void save(Articulo nuevo) throws ServiceException {
		try {
			dao.save(nuevo);
		} catch (GenericException | DuplicatedException e) {
			throw new ServiceException("Error al actualizar el articulo",e);
		}
	}
	
	@Override
	public Articulo getByCode(String code) throws ServiceException {
		try {
			return dao.getByCode(code);
		} catch (GenericException e) {			
			throw new ServiceException("Error al consutlar articulo",e);
		}
	}
}
