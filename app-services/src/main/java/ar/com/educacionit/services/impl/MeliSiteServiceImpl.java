package ar.com.educacionit.services.impl;

import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.ArticuloDaoMysqlImpl;
import ar.com.educacionit.daos.impl.MeliSiteDaoMysqlImpl;
import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.domain.Site;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.MeliSiteService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class MeliSiteServiceImpl extends AbstractBaseService<Site> implements MeliSiteService {


	public MeliSiteServiceImpl() {
		super(new MeliSiteDaoMysqlImpl());
	}

}