package de.springbootbuch.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AddToPrimaryConfigurationTest {
	
	@TestConfiguration
	static class MyConfig {}

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void serviceNotLoaded() {
		assertNotNull(applicationContext.getBean(MyConfig.class));
	}
	
}
