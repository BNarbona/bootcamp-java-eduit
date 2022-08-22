package ar.com.educacionit.services.impl;

import ar.com.educacionit.daos.impl.MarcaDaoMysqlImpl;
import ar.com.educacionit.domain.Marca;
import ar.com.educacionit.services.MarcaService;

public class MarcaServiceImpl extends AbstractBaseService<Marca> implements MarcaService {

	public MarcaServiceImpl() {
		super(new MarcaDaoMysqlImpl());
	}
	
}