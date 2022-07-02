package br.edu.infnet.appestabelecimento.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appestabelecimento.clients.UsuarioClients;
import br.edu.infnet.appestabelecimento.model.domain.Usuario;
@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioClients usuarioClients;

	public Usuario validar(String login, String senha) {
		return usuarioClients.validar(login, senha);
	}
	
	public void excluir(Integer id) {
		usuarioClients.excluir(id);
	}

	public List<Usuario> obterLista() {
		return usuarioClients.obterLista();
	}
}
