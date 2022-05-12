package ar.com.educacionit.daos;

import java.util.List;

import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Marca;


public interface MarcaDao {

	public List<Marca> findAll() throws GenericException;
	public void save (Marca marca) throws GenericException;
	public Marca getByPK (Long pk) throws GenericException;
	public void update (Marca marca) throws GenericException;
	public void delete (Long pk) throws GenericException;
	
 }
