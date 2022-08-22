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

import ar.com.educacionit.domain.Categoria;
import ar.com.educacionit.domain.Entity;
import ar.com.educacionit.domain.Marca;
import ar.com.educacionit.services.CategoriaService;
import ar.com.educacionit.services.MarcaService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;
import ar.com.educacionit.services.impl.MarcaServiceImpl;

@WebServlet("/api/AltaDatosController")
public class AltaDatosController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		CategoriaService categoriaService = new CategoriaServiceImpl();
		MarcaService marcaService = new MarcaServiceImpl();
		
		try {
			List<Categoria> categoriaList = categoriaService.findAll();
			List<Marca> marcaList = marcaService.findAll();
			
			Map<String, Object> json = new HashMap<>();
			json.put("categorias", categoriaList);
			json.put("marcas", marcaList);
			
			String jsonString = objectMapper.writeValueAsString(json);
			resp.getWriter().print(jsonString);
			
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}
	
		
	}
	
	
}
