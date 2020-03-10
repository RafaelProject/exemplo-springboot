package br.com.portoinvestimento.portoinvestimento.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApi {
	
	@Value("${teste.reqres.url}")
	private String url; 
	
	@Value("${teste.reqres.post}")
	private String post;
	
	public String getUrl() {
		return url;
	}
	
	public String getPost() {
		return post;
	}
}
