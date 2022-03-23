package clase7;

public class Carrito {

	Item [] items; 
	
	public Carrito() {
		this.items = new Item[0]; // lo ponemos vacio, porque cuando arranca esta vacio
	}
	
	public void agregarCarrito(Articulo articulo){
		Item nuevoItem = new Item (articulo,1);
		Item [] nuevos = new Item [this.items.length+1];
		for (int i=0; i< this.items.length; i++) {
			nuevos[i]= this.items[i];
		}
		nuevos[this.items.length] = nuevoItem;
		this.items = nuevos;
	}
	
	public void seguirComprando() {
		System.out.println("Seguimos comprando");
	}
	
	public void limpiar() {
		this.items = new Item[0]; 
	}
	
	public void actualizar(Item[] itemsActualizados) {
		this.items = itemsActualizados;
	}
	
	public Double obtenerPrecio(){
		Double precio = new Double (0); //es igual que Double precio = 0D;
		for(Item unItem : this.items) {
			precio += unItem.articulo.precio;
		}
		return precio;
	}
	
	public void eliminarItem(Item itemAEliminar) {
		for (Item unItem : this.items) {
			if(existeItem(itemAEliminar.articulo.id)) {
			   copiarItems(itemAEliminar.articulo.id);
			}
		}
	}
	
	
	public void copiarItems(Long id) {
		Item[] nuevos = new Item[this.items.length-1];
		int i = 0;
		for (Item unItem : this.items) {
			if(!unItem.articulo.id.equals(id)) {
				nuevos[i] = this.items[i];
				i++;
			}
		}
		this.items = nuevos;
	}
	
	public boolean existeItem (Long id) {
		boolean existe = false;
		for (Item unItem : this.items) {
			if(unItem.articulo.id.equals(id)) {
				existe = true;
				break;
			}
		}
		return existe;
	}
	
	public int obtenerCantidadItems() {
		return this.items.length;
	}
	
}
