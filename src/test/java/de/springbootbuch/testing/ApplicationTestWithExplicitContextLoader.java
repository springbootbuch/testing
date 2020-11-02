package de.springbootbuch.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(
	loader = SpringBootContextLoader.class,
	classes = Application.class
)
public class ApplicationTestWithExplicitContextLoader {

	@Test
	void contextLoads() {
	}
}
