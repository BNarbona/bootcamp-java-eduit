package ar.com.educacionit.daos;

import java.util.List;

import ar.com.educacionit.daos.db.exceptions.DuplicatedException;
import ar.com.educacionit.daos.db.exceptions.GenericException;

public interface GenericDao <T> {
	
	public List<T> findAll() throws GenericException;
	public void save (T articulo) throws GenericException, DuplicatedException;
	public T getByPK (Long pk) throws GenericException;
	public void update (T articulo) throws GenericException;;
	public void delete (Long pk) throws GenericException;
	
	public List<T> findPageable(Integer currentPage, Integer size) throws GenericException;

}
