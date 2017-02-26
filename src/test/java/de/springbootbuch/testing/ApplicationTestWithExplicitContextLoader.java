package de.springbootbuch.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(
	loader = SpringBootContextLoader.class,
	classes = Application.class
)
public class ApplicationTestWithExplicitContextLoader {

	@Test
	public void contextLoads() {
	}
}
