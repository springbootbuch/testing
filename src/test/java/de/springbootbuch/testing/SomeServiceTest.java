package de.springbootbuch.testing;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.response.MockRestResponseCreators.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.client.MockRestServiceServer;

@ExtendWith(SpringExtension.class)
@RestClientTest(SomeService.class)
public class SomeServiceTest {

	@Autowired
	private SomeService service;
	
	@Autowired
	private MockRestServiceServer server;

	@Test
	public void getRemoteInfoShouldWork() {
		this.server
			.expect(requestTo(
				"https://biking.michael-simons.eu/"
					+ "api/system/info"))
			.andRespond(withSuccess(
				"{\"spring-boot.version\": \"4711\"}", 
				MediaType.APPLICATION_JSON));
		assertThat(
			service.getRemoteInfo(), 
			is(equalTo("4711")));
	}
}
