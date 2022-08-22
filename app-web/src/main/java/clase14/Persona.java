package clase14;

public class Persona {

	private String nombre;
	private IIdioma idiomaNativo;
	private IIdioma[] masIdioma;

	public Persona(String nombre, IIdioma idiomaNativo) {
		this.nombre = nombre;
		this.idiomaNativo = idiomaNativo;
		this.masIdioma = new IIdioma[]{};
	}

	public void aprenderIdioma(IIdioma nuevoIdioma) {
		if (!existeIdioma(nuevoIdioma)) {
			IIdioma[] nuevo = new IIdioma[masIdioma.length + 1];
			for (int i = 0; i < masIdioma.length; i++) {
				nuevo[i] = masIdioma[i];
			}
			nuevo[masIdioma.length] = nuevoIdioma;
			masIdioma = nuevo;
		} else {
			System.out.println("El idioma ya existe");
		}
	}

	public void decir(String algo) {
		if (algo != null) {
			this.idiomaNativo.decir(algo);
		}
	}

	public void decir(String algo, IIdioma unIdioma) {
		IIdioma aux = null;

		if (!esMismoIdioma(this.idiomaNativo, unIdioma)) {

			for (int i = 0; aux == null && i < this.masIdioma.length; i++) { // este null es para no recorrer todo el
																				// array
				if (esMismoIdioma(this.masIdioma[i], unIdioma)) {
					aux = unIdioma;
				}
			}
			if (aux != null) {
				unIdioma.decir(algo);
			} else {
				System.out.println(this.nombre + " no habla " + unIdioma.getClass().getCanonicalName());
			}
		} else {
			this.decir(algo);
		}
	}

	private boolean esMismoIdioma(IIdioma source, IIdioma target) {
		return (source.getClass().equals(target.getClass()));

	}
	
	public boolean existeIdioma(IIdioma idioma) {
		boolean existe = false;
		for (int i = 0; !existe && i < masIdioma.length; i++) {
			existe = idioma.getClass().equals(masIdioma[i].getClass());
		}
		return existe;
	}
	
	public void decirEnTodos(String algo) {
		this.idiomaNativo.decir(algo);
		if(masIdioma!=null) {
			for (IIdioma idioma : masIdioma) {
				idioma.decir(algo);
			}
		}
	}
}
