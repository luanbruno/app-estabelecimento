package br.edu.infnet.appestabelecimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appestabelecimento.model.domain.Usuario;
import br.edu.infnet.appestabelecimento.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping(value = "/usuario/validar")
	public Usuario validar(@RequestParam String login, @RequestParam String senha) {
		return usuarioService.validar(login, senha);
	}
	
	@DeleteMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		usuarioService.excluir(id);
		return "redirect:/enderecos";
	}

	@GetMapping(value = "/usuario/listar")
	public String obterLista(Model model){
		//return usuarioService.obterLista();
		model.addAttribute("lista", usuarioService.obterLista());
		
		return "usuario/lista";
	}
}