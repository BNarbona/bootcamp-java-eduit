package ar.com.educacionit.services.impl;

import java.util.List;

import ar.com.educacionit.daos.MarcaDao;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.MarcaDaoMysqlImpl;
import ar.com.educacionit.domain.Marca;
import ar.com.educacionit.services.MarcaService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class MarcaServiceImpl implements MarcaService {

	private MarcaDao dao;
	
	public MarcaServiceImpl() {
		this.dao = new MarcaDaoMysqlImpl();
	}
	
	@Override
	public Marca getById(Long id) throws ServiceException {
		try {
			return dao.getByPK(id);
		} catch (GenericException e) {			
			throw new ServiceException("Error al consutlar Marca",e);
		}
	}

	
	public List <Marca> findAll() throws ServiceException {
		try {
			return dao.findAll();
		} catch (GenericException e) {			
			throw new ServiceException("Error al consutlar los Marcas",e);
		}
	}
	
	@Override
	public void deleteMarca(Long id) throws ServiceException {
		try {
			dao.delete(id);
		} catch (GenericException e) {			
			throw new ServiceException("Error al eliminar el Marca",e);
		}				
	}

	public void updateMarca(Marca marca) throws ServiceException {
			try {
				dao.update(marca);
			} catch (GenericException e) {
				throw new ServiceException("Error al actualizar el Marca",e);
			}				
	}
	
	@Override
	public void save(Marca nuevo) throws ServiceException {
		try {
			dao.save(nuevo);
		} catch (GenericException e) {
			throw new ServiceException("Error al actualizar el Marca",e);
		}
	}
	
}
