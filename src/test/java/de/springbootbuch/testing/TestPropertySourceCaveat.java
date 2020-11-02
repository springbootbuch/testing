package de.springbootbuch.testing;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestPropertySource
public class TestPropertySourceCaveat {
	@Value("${foo}")
	private String foo;
	
	
	@Test
	public void testProp() {
		assertThat(foo,
			is(equalTo("foo from de/springbootbuch/testing/TestPropertySourceCaveat.properties")));
	}
}
