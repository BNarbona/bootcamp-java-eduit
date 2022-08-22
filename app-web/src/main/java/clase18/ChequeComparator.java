package clase18;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class ChequeComparator implements Comparator<Cheque> {

	@Override
	public int compare(Cheque c1, Cheque c2) {
		int resta;

		if (c1 == null || c2 == null) {
			resta = 0;
		} else if (c1 == c2) {
			resta = 0;
		} else if (c1.getFechaPago() == null || c2.getFechaPago() == null) {
			resta = 0;
		} else {
			
			// puedo hacer esto de arriba en una clase padre, y el resto en una clase hija
			resta = c1.getFechaPago().compareTo(c2.getFechaPago()); 
		
				if(resta==0) {
					
					resta = c1.getBanco().compareTo(c2.getBanco()); //
					
					if (resta == 0) {
						resta = c1.getCmc7().compareTo(c2.getCmc7());
					}
				}
		}
		
		return resta;
	}

}
