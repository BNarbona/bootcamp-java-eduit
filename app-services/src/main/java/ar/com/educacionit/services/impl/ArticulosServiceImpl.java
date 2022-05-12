package ar.com.educacionit.services.impl;

import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.ArticuloDaoMysqlImpl;
import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class ArticulosServiceImpl extends AbstractBaseService<Articulo> implements ArticulosService {

	
	public ArticulosServiceImpl() {
		super(new ArticuloDaoMysqlImpl());
	}
	
	public Articulo getByCode(String code) throws ServiceException {
		try {
			return ((ArticuloDaoMysqlImpl)dao).getByCode(code); //Hago un downcasting
		} catch (GenericException e) {			
			throw new ServiceException("Error al consutlar articulo",e);
		}
	}
	
}
