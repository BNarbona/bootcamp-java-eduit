package clase10;

import clase7.Articulo;

public class Musica extends Articulo{

	private String [] listaTemas;
	
	public Musica(Long id, String nombre, String autor, Double precio, String urlImagen, String [] listaTemas) {
		super(id, nombre, autor, precio, urlImagen);
		this.listaTemas = listaTemas;
	}

	public String[] getListaTemas() {
		return this.listaTemas != null ? this.listaTemas: new String [0];  //uso operador ternario en lugar del if/else
	}

	public void setListaTemas(String[] listaTemas) {
		this.listaTemas = listaTemas;
	}
	
	public void agregarTema(String tema) {
		String [] nuevaListaTemas = new String[this.listaTemas.length+1];
		for(int i=0; i<this.listaTemas.length;i++) {
			nuevaListaTemas[i]=this.listaTemas[i];
		}
		nuevaListaTemas[this.listaTemas.length]=tema;
		this.listaTemas = nuevaListaTemas;
	}

	/*@Override
	public void detalle() {
			super.detalle();
			System.out.println("Listado de canciones");
			for(int i=0; i<this.listaTemas.length;i++) {
				System.out.println(this.getListaTemas()[i]);
			}
			
	}*/

	@Override
	public void detalleHijo() {
		System.out.println("Listado de canciones");
		for(int i=0; i<this.listaTemas.length;i++) {
			System.out.println(this.getListaTemas()[i]);
		}
		
	}
	
	
}
