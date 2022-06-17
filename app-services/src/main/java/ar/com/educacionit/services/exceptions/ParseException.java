package ar.com.educacionit.services.exceptions;

import java.io.IOException;

public class ParseException extends Exception {

	public ParseException(String msj) {
		super(msj);
	}


	public ParseException(String msj, Throwable e) {
		super(msj, e);
	}

	
	
}
