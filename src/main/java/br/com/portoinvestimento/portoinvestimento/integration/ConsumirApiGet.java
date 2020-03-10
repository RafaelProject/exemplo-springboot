package br.com.portoinvestimento.portoinvestimento.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.portoinvestimento.portoinvestimento.config.ConfigurationApi;
import br.com.portoinvestimento.portoinvestimento.domain.RequestGet;
import br.com.portoinvestimento.portoinvestimento.domain.ResponseGet;

@Component
public class ConsumirApiGet {
	
	@Autowired
	private ConfigurationApi api;
	
	public ResponseGet responseGet(RequestGet request) {
		RestTemplate rest = new RestTemplate();
		return rest.getForEntity(urlGet(), ResponseGet.class).getBody();
	}
	
	private String urlGet() {
		return api.getUrl() + api.getPost();
	}
}
