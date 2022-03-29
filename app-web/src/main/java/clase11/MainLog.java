package clase11;

import java.util.Scanner;

public class MainLog {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String op; //1-fs; 2-email
		String msj = "Mensaje a enviar";		
		
		/*Log log; // para hacer un refactor del codigo, lo saco afuera, lo creo como padre, y luego instancio segun opcion. Por polimorfismo, va a usar el metodo segun corresponda
		if(op.equals("1")) {
			log = new FSLog(msj);
			//log.loguear();lo saco afuera
		} else if (op.equals("2")) {
			log = new EmailLog(msj);
			//log.loguear();lo saco afuera
		} else {
			log = new DefaultLog(msj);//es conveniente crear una clase Default
			//log.loguear(); lo saco afuera
		}
		log.loguear();*/
		
		//Hacemos lo mismo, pero con un array
		
		System.out.println("Ingrese cantidad de log: ");
		int cantidad = teclado.nextInt();
			
		Log [] log = new Log[cantidad]; 
		
		for(int i=0;i<log.length;i++) {
			System.out.println("1- FS, 2- Email");
			op = teclado.next();
			
			/*if(op.equals("1")) {
				log [i]= new FSLog(msj);
				//log.loguear();lo saco afuera
			} else if (op.equals("2")) {
				log [i]= new EmailLog(msj);
				//log.loguear();lo saco afuera
			} else {
				log [i]= new DefaultLog(msj);//es conveniente crear una clase Default
				//log.loguear(); lo saco afuera
			}*/
			
			Log aux = getLog(op);
			aux.setMsj(msj);
			
			log[i] = aux;
		}	
		
		for(Log _log : log) {
			_log.loguear();
			if(_log instanceof IEjecutable) {
				IEjecutable iinterface = (IEjecutable)_log;
				iinterface.ejecutar();
			}
		}
		
	}
	
	public static Log getLog (String op) {
		Log log;
		if(op.equals("1")) {		//puedo hace un switch
			log = new FSLog();
		} else if (op.equals("2")) {
			log = new EmailLog();
		} else {
			log = new DefaultLog();
		}
		return log;
	}

}
