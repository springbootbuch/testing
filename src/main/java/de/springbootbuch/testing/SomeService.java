package de.springbootbuch.testing;

import java.util.Map;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SomeService {

	private final RestTemplate restTemplate;

	public SomeService(final RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	public String getRemoteInfo() {
		return (String) this.restTemplate.getForObject(
			"https://biking.michael-simons.eu/api/system/info",
			Map.class
		).get("spring-boot.version");
	}
}