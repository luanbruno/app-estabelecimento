package br.edu.infnet.appestabelecimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appestabelecimento.model.domain.Estabelecimento;
import br.edu.infnet.appestabelecimento.model.service.EstabelecimentoService;

@Controller
public class EstabelecimentoController {

	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	@PostMapping(value = "/estabelecimento/incluir")
	public String incluir( Estabelecimento estabelecimento) {
		estabelecimentoService.incluir(estabelecimento);
		return "redirect:/estabelecimentos";
	}
	
}
