package de.springbootbuch.testing;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.boot.test.web.client.TestRestTemplate;

@ExtendWith(OutputCaptureExtension.class)
public class SpringBootTestUtilitiesTest {

	private final TestRestTemplate template 
		= new TestRestTemplate();

	@Test
	public void testRequest(CapturedOutput output) {
		System.out.println("Using TestRestTemplate");
		String greeting = template.getForObject(
			"http://www.mocky.io/v2/58b5b1c61000009917ea574b", 
			String.class);
		assertThat(
			greeting, is(equalTo("Hello.")));
		assertThat(
			output.toString(), 
			containsString("TestRestTemplate"));
	}
}
