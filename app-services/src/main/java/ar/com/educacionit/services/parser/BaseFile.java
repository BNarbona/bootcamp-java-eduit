package ar.com.educacionit.services.parser;

import java.io.File;

import ar.com.educacionit.services.exceptions.ParseException;

public abstract class BaseFile {

	protected String filePath;
	
	public BaseFile(String filePath) {
		if(filePath == null || "".equals(filePath)) {
			//lanzo una RuntimeExcpetion
			throw new IllegalArgumentException("Debe indicar el path del archivo");
		}
		 this.filePath = filePath;
	}
	
	protected File getFile() throws ParseException {
		File file = new File (this.getFilePath()); //creo un metodo getter para encapsular y poner logica de control puede ser this.FilePath
		if(!file.exists()) {
			throw new ParseException("No existe el archivo: "+ file.getAbsolutePath());
		}
		return file;
	}
	
	public String getFilePath() {
		//aca puedo agregar logica de control del path
		return filePath;
	}
	
}
