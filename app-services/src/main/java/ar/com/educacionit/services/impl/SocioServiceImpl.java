package ar.com.educacionit.services.impl;

import ar.com.educacionit.daos.impl.SocioDaoMysqlImpl;
import ar.com.educacionit.domain.Socio;
import ar.com.educacionit.services.SocioService;

public class SocioServiceImpl extends AbstractBaseService <Socio> implements SocioService {
	
	public SocioServiceImpl() {
		super(new SocioDaoMysqlImpl());
	}
	
}
