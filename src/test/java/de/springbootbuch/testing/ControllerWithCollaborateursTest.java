package de.springbootbuch.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(ControllerWithCollaborateurs.class)
@MockBean(SomeService.class)
public class ControllerWithCollaborateursTest {

	@MockBean(SomeRepository.class)
	private SomeRepository someRepository;
	
	@Test
	public void testSomeMethod() {
	}

}