package br.edu.infnet.appestabelecimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appestabelecimento.model.domain.Estabelecimento;
import br.edu.infnet.appestabelecimento.model.service.EstabelecimentoService;

@Controller
public class EstabelecimentoController {

	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	@GetMapping(value = "/estabelecimento")
	public String cadastro(Model model) {
		return "estabelecimento/cadastro";
	}
	
	@PostMapping(value = "/estabelecimento/incluir")
	public String incluir( Estabelecimento estabelecimento) {
		estabelecimentoService.incluir(estabelecimento);
		return "redirect:/estabelecimentos";
	}
		
	@GetMapping(value = "/estabelecimentos")
	public String lista(Model model) {
		model.addAttribute("lista", estabelecimentoService.obterLista());
		return "estabelecimento/lista";
	}
	@GetMapping(value = "/estabelecimento/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		estabelecimentoService.excluir(id);
		return "redirect:/estabelecimentos";
	}
	
}
