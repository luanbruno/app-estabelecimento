package br.edu.infnet.appestabelecimento.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appestabelecimento.clients.FuncionarioClients;
import br.edu.infnet.appestabelecimento.model.domain.Funcionario;
@Service
public class FuncionarioService {
		
	@Autowired
	private FuncionarioClients funcionarioClients;

	public List<Funcionario> obterListaId(Integer id){
		return funcionarioClients.obterLista(id);
	}
	
	public void incluir(Funcionario funcionario) {
		funcionarioClients.incluir(funcionario);
	}
}
