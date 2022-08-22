package ar.com.educationit.web.jerseyClient.meli;

import java.util.List;

public class MeliSiteRestExecutorMain {

	public static void main(String[] args) {
		
		MeliSiteRestExecutor meli = new MeliSiteRestExecutor("https://api.mercadolibre.com/sites");
		
		List<MeliSite> lista = meli.execute();
	
		System.out.println(lista);
	}
	
}
