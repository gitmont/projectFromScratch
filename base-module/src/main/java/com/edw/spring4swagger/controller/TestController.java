package com.edw.spring4swagger.controller;

import com.edw.spring4swagger.bean.Test;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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