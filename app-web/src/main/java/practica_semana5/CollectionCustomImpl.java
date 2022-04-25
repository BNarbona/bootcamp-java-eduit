package practica_semana5;

import java.util.Arrays;

public class CollectionCustomImpl extends CollectionCustom <Articulo> {
	
	
	public CollectionCustomImpl(Articulo[] articulos) {
		super(articulos);
	}

	@Override
	public int size() {
		return tipos.length; 
	}	
	
	@Override
	public void addFirst (Articulo articulo) {
		Articulo [] nuevos = new Articulo [tipos.length+1];
		nuevos[0] = articulo;
		
		for(int i = 0; i<tipos.length; i++) {
			nuevos[i+1] = tipos[i];
		}
		tipos = nuevos;
	}

	@Override
	public void addLast(Articulo articulo) {
		Articulo [] nuevos = new Articulo [tipos.length+1];
	
		for(int i = 0; i<tipos.length; i++) {
			nuevos[i] = tipos[i];
		}
		nuevos[tipos.length] = articulo;
		tipos = nuevos;
	}
		
	@Override
	public Articulo remove(Articulo articulo) {		
		Articulo articuloAEliminar = null;
		if(existe(articulo)) {
			Articulo [] nuevos = new Articulo [tipos.length-1];
			int aux = 0;
			for(int i = 0; i<tipos.length; i++){
				if(!articulo.equals(tipos[i])){
					nuevos[aux]= tipos[i];
					aux++;
				}
			}
			tipos = nuevos;
			articuloAEliminar = articulo;
		} 
		return articuloAEliminar;
	}

	
	@Override
	public void removeAll() {
		tipos = new Articulo [0];
	}

	@Override
	public boolean empty() {
		return tipos.length == 0;
	}
	
	
	public boolean existe( Articulo articulo) {
		boolean aux = false;
		for(int i = 0; aux == false && i<tipos.length; i++ ) {
				if(tipos[i].equals(articulo)) {
					aux = true;				}
		}
		return aux;
	}

	@Override
	public String toString() {
		return "Listado [tipos=" + Arrays.toString(tipos) + "]";
	}
	
}
