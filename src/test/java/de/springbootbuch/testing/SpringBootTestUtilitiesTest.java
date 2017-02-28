package de.springbootbuch.testing;

import java.util.Map;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.hasKey;
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
		Map<Object, Object> info = template.getForObject(
			"https://biking.michael-simons.eu/api/system/info", 
			Map.class);
		assertThat(
			info, hasKey("spring-boot.version"));
		assertThat(
			output.toString(), 
			containsString("TestRestTemplate"));
	}
}
