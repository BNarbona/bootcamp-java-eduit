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

@WebServlet("/controller/AltaFormularioServlet")
public class AltaFormularioServlet extends HttpServlet {

	private static final long serialVersionUID = -3953577187787582717L;
	
	//GET
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		//capturar los datos que se enviaron desde el form
		String fecha = request.getParameter("fecha");//> String
		
		//aplica logica 
		
		
		Integer id=1;
		//pasar a la siguiente pagina
		//Guardo en el requestt el dato bajo una clave
		//request.setAttribute("idGen", id);
		
		
		ArticulosService as = new ArticulosServiceImpl();
		try {
			Collection<Articulo> lista =as.findAll();
			request.setAttribute("articulos", lista);
			//Ok
			getServletContext().getRequestDispatcher("/registroOk.jsp").forward(request, response);
		} catch (ServiceException e) {
			//fail
			getServletContext().getRequestDispatcher("/registroFail.jsp").forward(request, response);
		}
		
		//responder algo
		//response.getWriter().print("se ha grabado su orden");
		
		

	}
	
}
