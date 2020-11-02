package de.springbootbuch.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ControllerWithCollaborateurs.class)
@MockBean(SomeService.class)
public class ControllerWithCollaborateursTest {

	@MockBean(SomeRepository.class)
	private SomeRepository someRepository;
	
	@Test
	public void testSomeMethod() {
	}

}