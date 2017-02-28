package de.springbootbuch.testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
	@GetMapping("/hello")
	public String helloTest() {
		return "Hello, Test";
	}
}
