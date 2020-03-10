package br.com.portoinvestimento.portoinvestimento.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portoinvestimento.portoinvestimento.domain.PerfilFuncionarioRequest;
import br.com.portoinvestimento.portoinvestimento.domain.PerfilFuncionarioResponse;
import br.com.portoinvestimento.portoinvestimento.domain.ResponseJob;
import br.com.portoinvestimento.portoinvestimento.integration.ConsumirApi;

@Service
public class PerfilFuncionarioService {
	
	@Autowired
	private ConsumirApi api;
	
	public PerfilFuncionarioResponse dadosCadastraisFuncionario(PerfilFuncionarioRequest request) {
		return response(request);
	}
	
	private PerfilFuncionarioResponse response(PerfilFuncionarioRequest request) {
		PerfilFuncionarioResponse response = new PerfilFuncionarioResponse();
		ResponseJob responseApi = api.consumirApiReqres(request);
		
		response.setNome(responseApi.getName());
		response.setTrabalho(responseApi.getJob());
		response.setId(Integer.valueOf(responseApi.getId()));
		response.setDataInicio(responseApi.getCreatedAt());
		response.setSalario(request.getSalario());
		
		return response;
	}
}
