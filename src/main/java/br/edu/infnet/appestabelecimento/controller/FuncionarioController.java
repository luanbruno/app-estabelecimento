package br.edu.infnet.appestabelecimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appestabelecimento.model.domain.Funcionario;
import br.edu.infnet.appestabelecimento.model.service.EstabelecimentoService;
import br.edu.infnet.appestabelecimento.model.service.FuncionarioService;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	@GetMapping(value = "/funcionario")
	public String cadastro(Model model) {
		model.addAttribute("listaEstabelecimento", estabelecimentoService.obterLista());
		return "funcionario/cadastro";
	}

	@PostMapping(value = "/funcionario/incluir")
	public String incluir(Model model, Funcionario funcionario) {
		funcionarioService.incluir(funcionario);
		return "redirect:/funcionarios";
	}

	@GetMapping(value = "/funcionarios")
	public String lista(Model model) {
		model.addAttribute("lista", funcionarioService.obterLista());
		return "funcionario/lista";
	}

	@GetMapping(value = "/funcionario/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {
		funcionarioService.excluir(id);
		return "redirect:/funcionarios";
	}
	
	@GetMapping(value = "/{id}/listar")
	public String telaListaMunicipio(Model model,@PathVariable Integer id) {
		model.addAttribute("lista", funcionarioService.obterListaPorid(id));
		return "municipio/lista";
	}
	
}


