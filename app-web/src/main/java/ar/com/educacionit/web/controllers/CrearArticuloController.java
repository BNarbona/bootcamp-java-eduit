package ar.com.educacionit.web.controllers;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;
import ar.com.educacionit.web.enums.AttributesEnum;
import ar.com.educacionit.web.enums.ViewsEnum;


@WebServlet("/controller/CrearArticuloController")
public class CrearArticuloController extends BaseServlet {
		
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String titulo = req.getParameter("titulo");
		String codigo = req.getParameter("codigo");		
		String precio = req.getParameter("precio");	
		String stock = req.getParameter("stock");
		String marcasId = req.getParameter("marcaId");	
		String categoriasId = req.getParameter("categoriaId");	
		
		//valido previamente
		//IVlaidator validator = new AltaWebValidator(req) // request es objeto de la web solamente
		
		
		ViewsEnum target = ViewsEnum.LISTADO_CONTROLLER;
		try {
			ArticulosService service = new ArticulosServiceImpl();
			Articulo nuevo = new Articulo(titulo, codigo, null, Double.parseDouble(precio), Long.parseLong(stock), Long.parseLong(categoriasId), Long.parseLong(categoriasId));
			
			service.save(nuevo);
			super.setAttribute(AttributesEnum.EXITO, req, "Producto id: "+nuevo.getId()+" Ok");
		} catch (ServiceException e) {		
			super.setAttribute(AttributesEnum.ERROR_GENERAL, req, e.getMessage()+ " - " + e.getCause().getMessage());
		}
		
		//getServletContext().getRequestDispatcher(ViewsEnum.LISTADO_CONTROLLER.getValue()).forward(req, resp);
		
		redirect(target, req, resp);
	}
}
