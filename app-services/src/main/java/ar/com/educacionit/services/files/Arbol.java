package ar.com.educacionit.services.files;

import ar.com.educacionit.services.exceptions.Nodo;

public class Arbol {

	Nodo root;
	Nodo izq;
	Nodo der;
	
	public Arbol(Nodo root, Nodo izq, Nodo der) {
		this.root = root;
		this.izq = izq;
		this.der = der;
	}
	public Nodo getRoot() {
		return root;
	}
	public void setRoot(Nodo root) {
		this.root = root;
	}
	public Nodo getIzq() {
		return izq;
	}
	public void setIzq(Nodo izq) {
		this.izq = izq;
	}
	public Nodo getDer() {
		return der;
	}
	public void setDer(Nodo der) {
		this.der = der;
	}
	
	
	
}
