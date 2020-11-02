package de.springbootbuch.testing;

import static org.junit.rules.ExpectedException.*;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
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
		Assertions.assertThatExceptionOfType(NoSuchBeanDefinitionException.class)
			.isThrownBy(() -> applicationContext.getBean(SomeService.class));
	}
}
