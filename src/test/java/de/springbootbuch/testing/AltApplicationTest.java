package de.springbootbuch.testing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
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
	
	 @Autowired
	    private ApplicationContext ctx;

	@Test
	public void contextLoads() {
		Assert.assertThat(ctx.getBeansOfType(SomeService.class).size(), is(equalTo(1)));
	}
}
