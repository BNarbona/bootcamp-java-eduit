package ar.com.educacionit.services.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.domain.Socio;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.SocioService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;
import ar.com.educacionit.services.impl.SocioServiceImpl;

public class LectorDeArchivos {

	public static void main(String[] args) throws IOException, ServiceException {
		
		String path = "c:/desarrollo/educationit/clase37/clase37.txt";
		
		File file = new File(path);
		
		if(file.exists()) {			

			//leer el archivo
			List<Socio> socios = leerArchivo(file);
			
			if(!socios.isEmpty()) {
				SocioService service = new SocioServiceImpl();
				for(Socio socio: socios) {
					service.save(socio);

				}
			}
		}
		

	}

	private static List<Socio> leerArchivo(File file) throws IOException {
		
		FileReader fr = new FileReader(file);
	
		BufferedReader br = new BufferedReader(fr);
		
		String linea = null;
		
		//leo la primer linea y la descarto porque representa las columnas
		linea = br.readLine();
		
		List<Socio> SocioList = new ArrayList<>();
		
		while((linea = br.readLine()) != null) {
			Socio socio = SocioFromString(linea);
			SocioList.add(socio);
		}
		
		br.close();
		
		return SocioList;
	}

	private static Socio SocioFromString(String linea) {
		//narbona;brenda;25
		String[] datos = linea.split(";");
		String apellido = datos[0];
		String nombre = datos[1];
		String codigo = datos[2];
		
		Socio socio = new Socio(null, null, null);
		
		socio.setNombre(nombre);
		socio.setApellido(apellido);
		socio.setCodigo(codigo);
		
		return socio;
	}

}
