package ar.com.educationit.web.jerseyClient;

import java.util.List;

public interface RestClient<T> {

public T get(String userId);

public List<T> find(); 
	
}
