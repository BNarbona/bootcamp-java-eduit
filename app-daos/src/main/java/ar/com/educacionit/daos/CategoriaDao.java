package ar.com.educacionit.daos;

import java.util.List;

import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Categoria;


public interface CategoriaDao {

	public List<Categoria> findAll() throws GenericException;
	public void save (Categoria categoria) throws GenericException;
	public Categoria getByPK (Long pk) throws GenericException;
	public void update (Categoria Categoria) throws GenericException;
	public void delete (Long pk) throws GenericException;
	
 }
