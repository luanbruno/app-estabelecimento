package br.edu.infnet.appestabelecimento.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appestabelecimento.model.domain.Estabelecimento;
@FeignClient(url = "localhost:8081/api/estabelecimento", name = "estabelecimentoClient")
public interface EstabelecimentoClients {

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Estabelecimento estabelecimento);
	
	@GetMapping("/listar")
    List<Estabelecimento> obterLista();
	
}
