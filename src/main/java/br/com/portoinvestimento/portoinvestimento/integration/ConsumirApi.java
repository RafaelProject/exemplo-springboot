package br.com.portoinvestimento.portoinvestimento.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.portoinvestimento.portoinvestimento.config.ConfigurationApi;
import br.com.portoinvestimento.portoinvestimento.domain.PerfilFuncionarioRequest;
import br.com.portoinvestimento.portoinvestimento.domain.RequestJob;
import br.com.portoinvestimento.portoinvestimento.domain.ResponseJob;
import br.com.portoinvestimento.portoinvestimento.exception.BusinessException;

@Component
public class ConsumirApi {
	
	@Autowired
	private ConfigurationApi apiPost;
	
	private static final Logger log = LoggerFactory.getLogger(ConsumirApi.class);
	
	public ResponseJob consumirApiReqres(PerfilFuncionarioRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		
		try {
			log.info("Consumir API reqres >> POST dados funcionarios");
			ResponseEntity<ResponseJob> response = restTemplate.postForEntity(postUrl(), solicitarDados(request), ResponseJob.class);
			return response.getBody();
		}catch(Exception e) {
			log.error(String.format("Erro ao consumir API reqres >> POST dados funcionarios"));
			throw new BusinessException("Erro ao consumir api " + postUrl(), e);
		}
	}
	
	private String postUrl() {
		return apiPost.getUrl() + apiPost.getPost();
	}
	
	private RequestJob solicitarDados(PerfilFuncionarioRequest request) {
		RequestJob job = new RequestJob();
		job.setName(request.getNome());
		job.setJob(request.getTrabalho());
		return job;
	}
}
