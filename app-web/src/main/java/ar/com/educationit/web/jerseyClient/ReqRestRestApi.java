package ar.com.educationit.web.jerseyClient;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class ReqRestRestApi implements RestClient<ReqResUser> {

	@Override
	public ReqResUser get(String userId) {
		Client client = ClientBuilder.newClient();
		WebTarget WebTarget = client.target("https://reqres.in/").path("api/users/2");
		Invocation.Builder invocation = WebTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocation.get();
		ReqResUser user = response.readEntity(ReqResUser.class);
		
		return user;
	}

	@Override
	public List<ReqResUser> find() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
