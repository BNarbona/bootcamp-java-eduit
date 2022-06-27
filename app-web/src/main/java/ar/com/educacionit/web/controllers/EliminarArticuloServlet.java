package ar.com.educacionit.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

@WebServlet("/controller/EliminarArticuloServlet")
public class EliminarArticuloServlet extends HttpServlet {

	private static final long serialVersionUID = -5142922590519268044L;

	//GET
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		Long id = Long.parseLong(request.getParameter("id"));//> String
		
		ArticulosService as = new ArticulosServiceImpl();
		
		try {
			as.delete(id);
			getServletContext().getRequestDispatcher("/borradoOk.jsp").forward(request, response);
		} catch (ServiceException e) {
			//fail
			getServletContext().getRequestDispatcher("/registroFail.jsp").forward(request, response);
		}
		

	}
	
}
