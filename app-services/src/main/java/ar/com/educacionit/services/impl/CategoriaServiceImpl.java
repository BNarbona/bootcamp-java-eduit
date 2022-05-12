package ar.com.educacionit.services.impl;

import java.util.List;

import ar.com.educacionit.daos.CategoriaDao;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.CategoriaDaoMysqlImpl;
import ar.com.educacionit.domain.Categoria;
import ar.com.educacionit.services.CategoriaService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class CategoriaServiceImpl implements CategoriaService {

	private CategoriaDao dao;
	
	public CategoriaServiceImpl() {
		this.dao = new CategoriaDaoMysqlImpl();
	}
	
	@Override
	public Categoria getById(Long id) throws ServiceException {
		try {
			return dao.getByPK(id);
		} catch (GenericException e) {			
			throw new ServiceException("Error al consutlar Categoria",e);
		}
	}

	
	public List <Categoria> findAll() throws ServiceException {
		try {
			return dao.findAll();
		} catch (GenericException e) {			
			throw new ServiceException("Error al consultar los Categorias",e);
		}
	}
	
	@Override
	public void deleteCategoria(Long id) throws ServiceException {
		try {
			dao.delete(id);
		} catch (GenericException e) {			
			throw new ServiceException("Error al eliminar el Categoria",e);
		}				
	}

	public void updateCategoria(Categoria categoria) throws ServiceException {
			try {
				dao.update(categoria);
			} catch (GenericException e) {
				throw new ServiceException("Error al actualizar el Categoria",e);
			}				
	}
	
	@Override
	public void save(Categoria nuevo) throws ServiceException {
		try {
			dao.save(nuevo);
		} catch (GenericException e) {
			throw new ServiceException("Error al actualizar el Categoria",e);
		}
	}
	
}
