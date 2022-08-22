package clase16.service;

import clase16.service.impl.csvServiceParser;
import clase16.service.impl.pdfServiceParser;
import clase16.service.impl.xlsxServiceParser;

public class FileServiceBuilder {

	private String archivo;
		
	public FileServiceBuilder(String archivo) {
		if(archivo!=null) {
			this.archivo = archivo;
		} else{
			archivo = "";
		}
		
	}

	//creo un constructor para que el metodo no reciva parametros
	//gano que puedo validar en el constructor
	//deja de ser static


	public FileService buildService (String fileContent) {
		
		//nombre.ext
		String [] nombreArr = archivo.split("\\.");
		//nombreArr[0] nombre
		//nombreArr[1] ext 
		
		//int idx = archivo.lastIndexOf("."); // 6
		//String ext = archivo.substring(idx+1, archivo.length()); 
		
		
		FileService fs;
		switch(nombreArr[1]){
			case"csv":
				fs = new csvServiceParser(fileContent);
				break;
			case"xlsx":
				fs = new xlsxServiceParser(fileContent);
				break;
			case"pdf":
				fs = new pdfServiceParser(fileContent);
				break;
			default:
				fs = null;
				break;
			
		}
		
		return fs;
	}

}
