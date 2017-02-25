package de.springbootbuch.testing;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@Configuration
class MyBeans {

	@Bean 
	public SomePojo somePojo() {
		return new SomePojo();
	}
}

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MyBeans.class)
public class PlainSpringTest1 {

	@Autowired
	private SomePojo somePojo;

	@Test
	public void testSomePojo() {
		assertNotNull(somePojo);
	}
}
