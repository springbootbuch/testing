package de.springbootbuch.testing;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

@SpringBootTest
public class AltApplicationTest {

	@ClassRule
	public static final SpringClassRule SPRING_CLASS_RULE
		= new SpringClassRule();

	@Rule
	public final SpringMethodRule springMethodRule 
		= new SpringMethodRule();

	@Test
	public void contextLoads() {
	}
}
