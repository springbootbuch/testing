package de.springbootbuch.testing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RunWith(SpringRunner.class)
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