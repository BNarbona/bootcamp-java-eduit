package ar.com.educacionit.services.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ar.com.educacionit.domain.Socio;
import ar.com.educacionit.services.exceptions.ParseException;

public class CSVFileParser implements IParser <Collection<Producto>> {

	private String filePath;
	
	//path
	public CSVFileParser(String filePath) {
		if(filePath == null || "".equals(filePath)) {
			//lanzo una RuntimeExcpetion
			throw new IllegalArgumentException("Debe indicar el path del archivo");
		}
		 this.filePath = filePath;
	}

	//TDD + DDD VER 
	@Override
	public Collection <Producto> parse() throws ParseException {
		File file = this.getFile(); //creo un metodo para verificar si existe archivo
		try {
			return this.readFile(file);
		} catch (IOException e) {
			e.printStackTrace();
			throw new ParseException("Error leyendo el archivo"+ file.getName(), e);
		}
	}

	private File getFile() throws ParseException {
		File file = new File (this.getFilePath()); //creo un metodo getter para encapsular y poner logica de control puede ser this.FilePath
		if(!file.exists()) {
			throw new ParseException("No existe el archivo: "+ file.getAbsolutePath());
		}
		return file;
	}
	
	
	private static Collection<Producto> readFile(File file) throws IOException {
		
		FileReader fr = new FileReader(file);
	
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		//leo la primer linea y la descarto porque representa las columnas
		line = br.readLine();
		
		List<Producto> productList = new ArrayList<>();
		
		while((line = br.readLine()) != null) {
			Producto fileData = rowFromString(line);
			productList.add(fileData);
		}
		
		br.close();
		
		return productList;
	}

	private static Producto rowFromString(String linea) {
		String[] rowData = linea.split(";");
		String id = rowData[0];
		String title = rowData[1];
		String code = rowData[2];
		String price = rowData[3];
		
		Producto producto = new Producto(Long.parseLong(id), title, code, Double.parseDouble(price));		
		return producto;
	}

	public String getFilePath() {
		//aca puedo agregar logica de control del path
		return filePath;
	}
	
	
	
}
