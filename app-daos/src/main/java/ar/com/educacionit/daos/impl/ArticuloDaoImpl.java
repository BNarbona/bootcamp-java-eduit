package ar.com.educacionit.daos.impl;


import ar.com.educacionit.daos.ArticuloDao;
import ar.com.educacionit.daos.db.ConexionDB;
import ar.com.educacionit.daos.db.ConnectionException;
import ar.com.educacionit.domain.Articulo;


	

public class ArticuloDaoImpl implements ArticuloDao {

	private ConexionDB con;
	
	public ArticuloDaoImpl () {
		
		this.con = new ConexionDB("root","1234");
	}

	@Override
	public Articulo create(Articulo art) {
		
		try(ConexionDB con = this.con.open();){
			art.setid(10d);
		
		} catch (ConnectionException ce) {
			
		}
		return art;
	}

	@Override
	public Articulo read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo update(Articulo artUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}




}
