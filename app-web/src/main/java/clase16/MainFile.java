package clase16;

import clase16.service.FileService;
import clase16.service.FileServiceBuilder;

public class MainFile {

	public static void main(String[] args) {
		
		String archivo = "notas.pdf";
		String contenidoDelArchivo = "nombre; apellido;nota";
		
		//Le paso el archivo por constructor
		FileServiceBuilder fsb = new FileServiceBuilder(archivo);
		FileService service = fsb.buildService(contenidoDelArchivo);
		
		//Falta pasar el contenido del archivo, se lo podria mandar con un setter: service.setContent(contenidoDelArchivo);
		//O se lo paso por cosntructor
		
		service.save();
		service.validate();
		
		//Voy a sacar esto en una clase
		
		/*if(archivo.endsWith("csv")) {
			service = 	new csvServiceParser(archivo);		//Lo hago mas generico, asi el main habla con FileService. Reemplazo csvServiceParser service = new csvServiceParser(archivo);
			service.validate();
			//etc etc
		} else if(archivo.endsWith("xlsx")) {
			//service = new xlsxServiceParser(archivo); completar!
			//service.vaidate();
			//etc
		}*/
		
	}

}
