package clase20;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

//clase inmutable
public class Venta {

	private Long idVendedor;
	//private Vendedor vendedor; no puedo usar el objeto vendedor
	private Date fecha;
	private Double monto;
	
	//debe nacer si o si con los datos
	public Venta(Long idVendedor, Date fecha, Double monto) {
		this.idVendedor = idVendedor;
		this.fecha = fecha;
		this.monto = monto;
	}

	
	
	public Long getIdVendedor() {
		return idVendedor;
	}


	public Date getFecha() {
		return fecha;
	}

	public Double getMonto() {
		return monto;
	}


	@Override
	public String toString() {
		return "Venta [idVendedor=" + idVendedor + ", fecha=" + fecha + ", monto=" + monto + "]";
	}





	@Override
	public int hashCode() {
		return Objects.hash(fecha, idVendedor, monto);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return this.idVendedor.equals(other.getIdVendedor()); //cambio el codigo, solo compara por id.
	}

	//hashCode|equals*/
	
	
	
}
