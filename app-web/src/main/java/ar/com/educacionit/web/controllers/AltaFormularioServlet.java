package ar.com.educacionit.web.controllers;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;
import ar.com.educacionit.web.enums.AttributesEnum;
import ar.com.educacionit.web.enums.ViewsEnum;

@WebServlet("/controller/AltaFormularioServlet")
public class AltaFormularioServlet extends BaseServlet {

	private static final long serialVersionUID = -3953577187787582717L;
	
	//GET
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		/*capturar los datos que se enviaron desde el form
		String fecha = request.getParameter("fecha");//> String
		//aplica logica 
		
		Integer id=1;
		//pasar a la siguiente pagina
		//Guardo en el requestt el dato bajo una clave
		request.setAttribute("idGen", id);*/
		
		
		ViewsEnum target = ViewsEnum.REGISTRO_OK; // lo uso como vista por defecto
		
		ArticulosService as = new ArticulosServiceImpl();
		try {
			Collection<Articulo> lista =as.findAll();
			//request.setAttribute(AttributesEnum.ARTICULOS.getValue(), lista);
			//Ok
			setAttribute(AttributesEnum.ARTICULOS, request, lista);
			
		} catch (ServiceException e) {
			//fail
			target = ViewsEnum.REGISTRO_FAIL; // si falla cambio el target
		}
		
		redirect(target, request, response); // me queda un solo redirect
		
		//responder algo
		//response.getWriter().print("se ha grabado su orden");
		
	}
	
}
