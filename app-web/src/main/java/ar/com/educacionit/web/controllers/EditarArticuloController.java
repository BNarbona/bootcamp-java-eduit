package ar.com.educacionit.web.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.domain.Categoria;
import ar.com.educacionit.domain.Marca;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;
import ar.com.educacionit.web.enums.AttributesEnum;
import ar.com.educacionit.web.enums.ViewsEnum;

@WebServlet("/controller/EditarArticuloController")
public class EditarArticuloController extends BaseServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String id = request.getParameter("id");//> String
		
		
		if(id != null) {
			try {
				ArticulosService as = new ArticulosServiceImpl();
				Articulo articulo = as.getById(Long.parseLong(id));
				ObjectMapper objectMapper = new ObjectMapper();
						
				String jsonString = objectMapper.writeValueAsString(articulo);
				response.getWriter().print(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
}