package br.edu.infnet.appestabelecimento.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.appestabelecimento.model.domain.AcessoUser;
import br.edu.infnet.appestabelecimento.model.domain.Role;
import br.edu.infnet.appestabelecimento.model.service.AcessoUserService;
import br.edu.infnet.appestabelecimento.model.service.RoleService;
@SessionAttributes("user")
@Controller
public class AcessoUserController {
	
	@Autowired
	private AcessoUserService acessoUserService;
	@Autowired
	private RoleService roleService;
	
	
	@GetMapping(value = "/usuario")
	public String telaCadastro(Model model) {

		model.addAttribute("roles", roleService.obterLista());

		return "usuario/cadastro";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Model model, AcessoUser acessoUser,@RequestParam Integer acesso) {

		
		acessoUser.setRoles(Arrays.asList(new Role(acesso)));
		
		acessoUserService.incluir(acessoUser);

		model.addAttribute("mensagem", "O usuário " + acessoUser.getNome() + " foi cadastrado com sucesso!!!");

		return "redirect:/";
	}

}