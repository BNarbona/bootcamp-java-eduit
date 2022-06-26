package ar.com.educacionit.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller/AltaFormularioServlet")
public class AltaFormularioServlet extends HttpServlet {

	private static final long serialVersionUID = -3953577187787582717L;
	
	//GET
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		//capturar los datos que se enviaron desde el form
		String fecha = request.getParameter("fecha");//> String
		
		//aplica logica 
		
		//responder algo
//		response.getWriter().print("se ha grabado su orden");
		getServletContext().getRequestDispatcher("/registroOk.html").forward(request, response);

	}
	
	/*
	
	//POST
	//file
	public void post(request, response) {
		o
		//capturar los datos que se enviaron desde el form
		
		//aplica logica 
		
		//responder algo
	}*/
}
