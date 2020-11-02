package de.springbootbuch.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration
public class PlainSpringTest3 {

	@Autowired
	private SomePojo somePojo;

	@Test
	public void testSomePojo() {
		assertNotNull(somePojo);
	}
}
