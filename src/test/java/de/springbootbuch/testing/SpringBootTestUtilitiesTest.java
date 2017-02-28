package de.springbootbuch.testing;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.boot.test.web.client.TestRestTemplate;

public class SpringBootTestUtilitiesTest {

	@Rule
	public OutputCapture output = new OutputCapture();

	private final TestRestTemplate template 
		= new TestRestTemplate();

	@Test
	public void testRequest() throws Exception {
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
