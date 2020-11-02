package de.springbootbuch.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Configuration
class MyBeans {

	@Bean 
	public SomePojo somePojo() {
		return new SomePojo();
	}
}

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MyBeans.class)
public class PlainSpringTest1 {

	@Autowired
	private SomePojo somePojo;

	@Test
	public void testSomePojo() {
		assertNotNull(somePojo);
	}
}
