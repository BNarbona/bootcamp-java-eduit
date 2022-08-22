package clase12;

public class ServiceS2 implements IService {

	@Override
	public Dato consultar() {
		String res = "id0001nombrecarlos    saldo01550";
		
		String idStr = res.substring(2,6);
		String nombreStr = res.substring(12,22);
		
		String saldo = res.substring(res.length()-5,res.length());
		
		return new Dato (Long.parseLong(idStr), nombreStr);
	
	}

}
