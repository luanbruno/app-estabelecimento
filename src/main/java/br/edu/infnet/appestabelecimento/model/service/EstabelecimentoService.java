package br.edu.infnet.appestabelecimento.model.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appestabelecimento.clients.EstabelecimentoClients;
import br.edu.infnet.appestabelecimento.model.domain.Estabelecimento;
@Service
public class EstabelecimentoService {

	@Autowired
	private EstabelecimentoClients estabelecimentoClients;

	public void incluir(Estabelecimento estabelecimento) {
		estabelecimentoClients.incluir(estabelecimento);
	}
	public List<Estabelecimento> obterLista(){
      return estabelecimentoClients.obterLista();
  }
	
	public Estabelecimento obterListaId(Integer idEstabelecimento){
	      return this.estabelecimentoClients.obterPorId(idEstabelecimento);
	  }
	public void excluir(Integer idEstabelecimento) {
		this.estabelecimentoClients.excluir(idEstabelecimento);
	}
}
