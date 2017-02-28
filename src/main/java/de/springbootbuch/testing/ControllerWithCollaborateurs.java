package de.springbootbuch.testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWithCollaborateurs {
	private final SomeService someService;
	
	private final SomeRepository someRepository;

	public ControllerWithCollaborateurs(
		SomeService someService, 
		SomeRepository someRepository
	) {
		this.someService = someService;
		this.someRepository = someRepository;
	}
	
	@GetMapping("/callServices")
	public String callServices() {
		// Do something with
		// someService and someRepository
		return "done\n";
	}
}
