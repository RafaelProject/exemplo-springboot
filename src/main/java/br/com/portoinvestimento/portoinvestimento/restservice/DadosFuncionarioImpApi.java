package br.com.portoinvestimento.portoinvestimento.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portoinvestimento.portoinvestimento.business.PerfilFuncionarioService;
import br.com.portoinvestimento.portoinvestimento.domain.PerfilFuncionarioRequest;
import br.com.portoinvestimento.portoinvestimento.domain.PerfilFuncionarioResponse;
import br.com.portoinvestimento.portoinvestimento.domain.RequestGet;
import br.com.portoinvestimento.portoinvestimento.domain.ResponseGet;
import br.com.portoinvestimento.portoinvestimento.integration.ConsumirApiGet;

@RestController
@RequestMapping("/teste")
public class DadosFuncionarioImpApi {
	
	@Autowired
	PerfilFuncionarioService service;
	
	@Autowired
	ConsumirApiGet serviceGet;
	
	@GetMapping
	public ResponseEntity<ResponseGet> index(RequestGet request) {
		return new ResponseEntity<ResponseGet>(serviceGet.responseGet(request), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<PerfilFuncionarioResponse> index(@RequestBody PerfilFuncionarioRequest usuario) {
		return new ResponseEntity<PerfilFuncionarioResponse>(service.dadosCadastraisFuncionario(usuario), HttpStatus.OK);
	}
}
