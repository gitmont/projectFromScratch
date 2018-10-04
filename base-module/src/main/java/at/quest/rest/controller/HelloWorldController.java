package at.quest.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.core.Application;
//import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RestController;

@RestController
//@Path("/firstStart")
public class HelloWorldController {

//	@GET
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public ResponseEntity<String> helloWorldMethod() {
		return new ResponseEntity<String>("KONACNO", HttpStatus.OK);
	}

}
