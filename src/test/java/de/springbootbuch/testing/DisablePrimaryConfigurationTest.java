package de.springbootbuch.testing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.rules.ExpectedException.none;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DisablePrimaryConfigurationTest {

	@Configuration
	static class MyConfig {}

	@Autowired
	private ApplicationContext applicationContext;

	@Rule
	public ExpectedException expectedException = none();

	@Test
	public void serviceNotLoaded() {
		expectedException.expect(NoSuchBeanDefinitionException.class);
		applicationContext.getBean(SomeService.class);
	}
}
