package ar.com.educacionit.web.controllers;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import ar.com.educacionit.domain.Articulo;

public class ReflectionApiMain {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Articulo articulo = new Articulo(1L, "Zapatilla", "101010cod", new Date(), 1500D, 1l,1l,1l);
		
		mostrarAtributos(articulo);
		
	}
	
	private static void mostrarAtributos(Object ob) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//obtengo los atributos
		Field[] atributos = ob.getClass().getDeclaredFields();
		
		//Object nuevo = ob.getClass().newInstance();
		
		for(Field f: atributos) {
			f.setAccessible(true);
			System.out.println(f.getName()+" ");
			//obtengo los valores de los atributos
			Object valor = f.get(ob);
			System.out.println(valor);
			
		}
		
	}
		
}