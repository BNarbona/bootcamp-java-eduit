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
import ar.com.educacionit.web.enums.AttributesEnum;
import ar.com.educacionit.web.enums.ViewsEnum;

@WebServlet("/controller/DeleteArticuloController")
public class DeleteArticuloController extends BaseServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String id = request.getParameter("id");//> String
		ViewsEnum target = ViewsEnum.LISTADO_CONTROLLER;
		
		if(id != null) {
			ArticulosService as = new ArticulosServiceImpl();
			try {
				as.delete(Long.parseLong(id));
				super.setAttibute(AttributesEnum.EXITO, request, "Se ha eliminado exitosamente el id: " +id);
			} catch (ServiceException e) {
				e.printStackTrace();
				super.setAttibute(AttributesEnum.ERROR_GENERAL, request, e.getMessage() + " - " + e.getCause().getMessage());
			}
		}
		else {
		}
		
		redirect(target, request, response);
		

	}
	
}
