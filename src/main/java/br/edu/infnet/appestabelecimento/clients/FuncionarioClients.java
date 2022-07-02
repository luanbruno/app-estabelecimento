package br.edu.infnet.appestabelecimento.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appestabelecimento.model.domain.Funcionario;
@FeignClient(url = "localhost:8080/api/funcionario", name = "funcionarioClient")
public interface FuncionarioClients {


	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Funcionario funcionario);
	
	@GetMapping(value = "/{id}/listar")
	public List<Funcionario> obterLista(@PathVariable Integer id);
	
}
