package at.quest.rest.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import at.quest.entites.Test;

@RestController
public class TestController {

	@ApiOperation(value = "Testing Page")
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public Test test(@RequestParam String name, @RequestParam(required = false) String address) {
		Test test = new Test();
		test.setAddress(address);
		test.setName(name);
		return test;
	}

}