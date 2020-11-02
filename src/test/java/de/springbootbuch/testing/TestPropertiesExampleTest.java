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
@SpringBootTest(properties = {
	"foo = foo from SpringBootTest", 
	"bar = bar from SpringBootTest"
})
@TestPropertySource(properties = {
	"foo = foo from TestPropertySource"
})
public class TestPropertiesExampleTest {
	@Value("${foo}")
	private String foo;
	
	@Value("${bar}")
	private String bar;
	
	@Test
	public void testProp() {
		assertThat(foo,
			is(equalTo("foo from TestPropertySource")));
		assertThat(bar, 
			is(equalTo("bar from SpringBootTest")));
	}
}
