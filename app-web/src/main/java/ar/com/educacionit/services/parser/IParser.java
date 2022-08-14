package ar.com.educacionit.services.parser;

import java.io.IOException;
import java.util.Collection;

import ar.com.educacionit.services.exceptions.ParseException;

public interface IParser <T> {

	
	public T parse() throws ParseException; 
	
	
	
}
