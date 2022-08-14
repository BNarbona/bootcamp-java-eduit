package ar.com.educacionit.web.controllers;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import ar.com.educacionit.services.parser.CSVFileParser;
import ar.com.educacionit.services.parser.IParser;
import ar.com.educacionit.services.parser.ArticuloDTO;
import ar.com.educacionit.services.parser.XLSXFileParser;
import ar.com.educacionit.web.enums.ActionBuilder;
import ar.com.educacionit.web.enums.AttributesEnum;
import ar.com.educacionit.web.enums.FormatoEnum;
import ar.com.educacionit.web.enums.IFormato;
import ar.com.educacionit.web.enums.ViewsEnum;

@WebServlet("/controller/UploadController")
@MultipartConfig
public class UploadController extends BaseServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//capturar el "file" > se llama Part
		Part filePart = req.getPart("file");
		
		ViewsEnum target = ViewsEnum.UPLOAD_PREVIEW;
		
		if(filePart == null || filePart.getSize() == 0) {
			super.setAttribute(AttributesEnum.ERROR_GENERAL,req,"Debe seleccionar un Archivo");
			target = ViewsEnum.UPLOAD;
			redirect(target, req, resp);
		}
		
		String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
		
		String ext = this.getExt(fileName);
		
		IParser<Collection<ArticuloDTO>> fileParser = null;
		
		switch (ext) {
			case "csv":
			 fileParser = new CSVFileParser(filePart);
				break;
			/*case "xls":
				//fileParser = new XLSFileParser(filePart);
				break;	
			case "xlsx":
				fileParser = new XLSXFileParser(filePart);
				break;*/	
			default:
				break;
		}
		
		if(fileParser == null) {
			super.setAttribute(AttributesEnum.ERROR_GENERAL, req, "Ext de archivo incorrecta");
			target = ViewsEnum.UPLOAD;
			redirect(target, req, resp);
		}
		
		try {
			Collection<ArticuloDTO> articulos = fileParser.parse();
			super.setAttribute(AttributesEnum.UPLOAD_PREVIEW_KEY, req.getSession(), articulos);
		}catch (Exception e) {
			super.setAttribute(AttributesEnum.ERROR_GENERAL, req, "No se ha podido parsear el archivo: "+ fileName);
		}
		
		redirect(target, req, resp);
		
		//InputStream (es el dato)
		
		
		
		//convertir a Collection<Tipo>
		
		//grabar en db
		
	}

	private String getExt(String fileName) {
		String[] names = fileName.split("\\.");
		return names[names.length-1];
	}
	
}
