package de.springbootbuch.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestPropertySource(locations = "file:${user.home}/springbootbuchdemo.properties")
@Disabled("To run this test create the file mentioned above and remote this annotation")
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
