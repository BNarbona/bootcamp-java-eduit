package ar.com.educationit.web.jerseyClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ar.com.educationit.web.jerseyClient.ListReqRestUser;

public class ReqRestRestClient {

	
	public static void main(String[] args) {
		
		//Client usamos para comunicarnos
		Client client = ClientBuilder.newClient();
		
		//WebTarget Es la url a donde voy a consultar la info
		//https://reqres.in/api/users/2
		
		WebTarget WebTarget = client.target("https://reqres.in/").path("api/users");
		
		//Invocation (ges/post/put) 
	
		Invocation.Builder invocation = WebTarget.request(MediaType.APPLICATION_JSON);
		
		//get capturamos la info que vuelve
		
		Response response = invocation.get();
		
		ListReqRestUser user = response.readEntity(ListReqRestUser.class);
		System.out.println(user);
		
	}
}
