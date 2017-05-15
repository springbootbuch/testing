package de.springbootbuch.testing;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "file:${user.home}/springbootbuchdemo.properties")
@Ignore("To run this test create the file mentioned above and remote this annotation")
public class TestPropertiesFromFileTest {
	
	private static final Logger LOG = LoggerFactory
		.getLogger(TestPropertiesFromFileTest.class);
	
	@Value("${foo}")
	private String foo;
	
	@Test
	public void displayFoo() {
		LOG.info("foo =  {}",foo );
	}
}