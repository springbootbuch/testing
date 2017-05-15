package de.springbootbuch.testing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class RandomPortsTest {
	
	private static final Logger LOG = LoggerFactory
		.getLogger(RandomPortsTest.class);
	
	@LocalServerPort
	private int localServerPort;

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void printPortAndMakeCall() {
		LOG.info("Test uses {}", localServerPort);
		assertThat(
			restTemplate.getForObject(
				"/hello", String.class),
			is(equalTo("Hello, Test"))
		);
	}
}
