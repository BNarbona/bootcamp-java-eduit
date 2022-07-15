package ar.com.educationit.web.jerseyClient.meli;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ar.com.educationit.web.jerseyClient.ListReqRestUser;

public class MeliSiteRestClient {

	
	public static void main(String[] args) {
		
		//Client usamos para comunicarnos
		Client client = ClientBuilder.newClient();
		
		//WebTarget Es la url a donde voy a consultar la info
		//https://reqres.in/api/users/2
		
		WebTarget WebTarget = client.target("https://api.mercadolibre.com/").path("sites");
		
		//Invocation (ges/post/put) 
	
		Invocation.Builder invocation = WebTarget.request(MediaType.APPLICATION_JSON);
		
		//get capturamos la info que vuelve
		
		Response response = invocation.get();
		
		List<MeliSite> user = response.readEntity(new GenericType<List<MeliSite>>() {});
		//List<MeliSite> user = response.readEntity(List.class); //este genera warning
		System.out.println(user);
		
	}
}
