package com.account.project.assessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@RestController
@SpringBootApplication
public class App 
{
	class Message {
		private String message;
		public Message(String message) {
			this.message = message;
		}
		public String getMessage() {
			return message;
		}
	}

	 //  @GetMapping("echo/hello")
	   // public String getHelloMessage() {
	     //   return "Hello Spring Boot world!";
	    //}


	@RequestMapping(path = "/echo/{message}", method= RequestMethod.GET)
	public Message echo(@PathVariable("message") String message) {

		return new Message(message);

	}
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
