package de.springbootbuch.testing;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddToPrimaryConfigurationTest {
	
	@TestConfiguration
	static class MyConfig {}

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void serviceNotLoaded() {
		assertNotNull(applicationContext.getBean(MyConfig.class));
	}
	
}
