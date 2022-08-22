package clase17;

import java.util.ArrayList;
import java.util.List;

public class Carrito1 {

	private List<String> items;
	
	public Carrito1(){
		items = new ArrayList<String>();
	}
	
	public void agregar(String item) {
		items.add(item);
	}
}


