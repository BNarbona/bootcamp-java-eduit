package ar.com.educationit.web.jerseyClient.meli;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ar.com.educationit.web.jerseyClient.ReqResUser;

public abstract class RestClientExecutor <T> {

	//url
	protected String urlRestApi;

	public RestClientExecutor(String urlRestApi) {
		this.urlRestApi = urlRestApi;
	}
	
	public T execute() {
		Client client = ClientBuilder.newClient();
		WebTarget WebTarget = this.buildWebTarget(client);	//client.target("https://reqres.in/").path("api/users/2");
		Invocation.Builder invocation = WebTarget.request(MediaType.APPLICATION_JSON);
		Response response = this.biuldResponse(invocation); //invocation.get();
		T responseDTO = this.buildReponseDTO(response);//ReqResUser user = response.readEntity(ReqResUser.class);
		return responseDTO;
	}

	protected abstract T buildReponseDTO(Response response);

	private Response biuldResponse(Builder invocation) {
		return invocation.get();
	}
	

	private WebTarget buildWebTarget(Client client) {
		return client.target(this.getUrlRestApi());
	}
	
	public String getUrlRestApi() {
		return this.urlRestApi;
	}
	
	
}
