package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@CustomAdvice
@Controller("/")
public class HomeController {

	@Get
	public String index() {
		System.out.println("In HomeController#index");
		return "Hello";
	}

}
