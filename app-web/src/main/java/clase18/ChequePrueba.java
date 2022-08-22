package clase18;

import java.util.Date;

public class ChequePrueba implements Comparable<ChequePrueba> {

	private String cmc7;
	private String banco;
	private Date fechaPago;
	
	
	
	public ChequePrueba(String cmc7, String banco) {
		this.cmc7 = cmc7;
		this.banco = banco;
	}



	@Override
	public int compareTo(ChequePrueba b) {
		int valor;
		if(b == null) {
			valor = 0; // lo considero como un igual para que no lo agrege
		}
		if(this == b) {
			valor = 0;  // compara los espacios de memoria
		}
		
		if(this.cmc7.equals(b.cmc7)) {
			valor = this.banco.compareTo(b.banco); // agrego otro comparador con banco
		} else {
			valor = this.cmc7.compareTo(b.cmc7); //defino yo que el cmc7 es quien define la igualdad
			}
		return valor;
		}


	@Override
	public String toString() {
		return "ChequePrueba [cmc7=" + cmc7 + ", banco=" + banco + "]";
	}

	
}
