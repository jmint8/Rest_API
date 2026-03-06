package RestAPI_Intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestServer{
	public static void main(String[] args){
        SpringApplication.run(RestServer.class, args);
    }
	@GetMapping("/request/{username}")
    public String getPassword(@PathVariable String username) {
        return username + "207";
	}
	
	@GetMapping("/auth/{username}/{password}")
    public String authenticate(@PathVariable String username, @PathVariable String password) {
        String expectedPassword = username + "207";
        
        if (expectedPassword.equals(password)) {
            return "Authenticated " + username;
        } else {
            return "Invalid credentials, try agin.";
        }
    }
}
