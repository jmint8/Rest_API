package RestAPI_Intro;

import org.springframework.web.client.RestClient;

public class request {

	public static void main(String [] args)
	{
		RestClient defualtClient = RestClient.create();
		String username ="jmint";
		
		String password = defualtClient.get()
				.uri("http://cs-hydra.centre.edu:9000/request/{username}", username)
				.retrieve()
				.body(String.class);
		
		String auth = defualtClient.get()
				.uri("http://cs-hydra.centre.edu:9000/auth/{username}/{password}", username, password)
				.retrieve()
				.body(String.class);
		
		System.out.print(password);
		System.out.print(auth);

	}
}
