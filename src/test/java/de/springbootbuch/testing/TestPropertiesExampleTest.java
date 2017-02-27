package de.springbootbuch.testing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
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
