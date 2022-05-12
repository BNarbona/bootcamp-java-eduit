package ar.com.educacionit.services.impl;

import ar.com.educacionit.daos.impl.CategoriaDaoMysqlImpl;
import ar.com.educacionit.domain.Categoria;
import ar.com.educacionit.services.CategoriaService;

public class CategoriaServiceImpl extends AbstractBaseService <Categoria> implements CategoriaService {
	
	public CategoriaServiceImpl() {
		super(new CategoriaDaoMysqlImpl());
	}
	
}
