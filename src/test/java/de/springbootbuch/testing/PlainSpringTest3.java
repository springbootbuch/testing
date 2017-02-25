package de.springbootbuch.testing;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class PlainSpringTest3 {

	@Autowired
	private SomePojo somePojo;

	@Test
	public void testSomePojo() {
		assertNotNull(somePojo);
	}
}
