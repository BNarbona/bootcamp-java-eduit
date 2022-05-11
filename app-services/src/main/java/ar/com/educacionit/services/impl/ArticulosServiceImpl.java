package ar.com.educacionit.services.impl;

import java.util.List;

import ar.com.educacionit.daos.ArticuloDao;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.ArticuloDaoMysqlImpl;
import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class ArticulosServiceImpl implements ArticulosService {

	//puede tener una instancia de algun dao
	//necesitamos el de articulo
	private ArticuloDao dao;
	
	public ArticulosServiceImpl() {
		//depende la la db 
		//String motorDb= System.getenv("TIPO_MOTOR");
		//if(motorDb.equals(MYSQL){ implemento un motor, sino otro en un else
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
}
