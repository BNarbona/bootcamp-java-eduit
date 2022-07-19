package ar.com.educacionit.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;
import ar.com.educacionit.web.enums.AttributesEnum;
import ar.com.educacionit.web.enums.ViewsEnum;

@WebServlet("/controller/ListadoController")
public class ListadoController extends BaseServlet {

	private static final long serialVersionUID = -3953577187787582717L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
				
		ArticulosService as = new ArticulosServiceImpl();
		ViewsEnum target = ViewsEnum.LISTADO; 
		
		Collection<Articulo> list = new ArrayList<>();
		
		try {
			list = as.findAll();
			
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		setAttibute(AttributesEnum.ARTICULOS, request, list);
		redirect(target, request, response);
		
		
	}
	
}
