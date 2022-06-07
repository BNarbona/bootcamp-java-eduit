package ar.com.educacionit.services.files;

import java.io.File;
import java.io.IOException;

public class FirstFileName {

	public static void main(String[] args) throws IOException {
		//crear un objeto de la clase file

		File archivo = new File("c:/desarrollo/text.txt");
		
		boolean exists = archivo.exists();
		
		if(!exists) {
			archivo.createNewFile();
		}
		
		exists = archivo.exists();
		System.out.println(exists);
		
		boolean isFile = archivo.isFile();
		boolean isDirectory = archivo.isDirectory();
		
		System.out.println(isFile);
		System.out.println(isDirectory);
	}

}
