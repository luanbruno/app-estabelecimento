package br.edu.infnet.appestabelecimento.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.edu.infnet.appestabelecimento.model.domain.AcessoUser;
import br.edu.infnet.appestabelecimento.model.repository.UsuarioRepository;
@Service
public class AcessoUserService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public void incluir(AcessoUser acessoUser) {
		acessoUser.setSenha(bCryptPasswordEncoder.encode(acessoUser.getSenha()));
		usuarioRepository.save(acessoUser);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public AcessoUser autenticar(String email, String senha) {
		AcessoUser acessoUser = usuarioRepository.findByEmail(email);
		if (acessoUser != null) {

			if (acessoUser.getSenha().equals(senha)) {
				return acessoUser;
			}
		}
		return null;
	}
	public AcessoUser findByEmail(String string) {
		return this.usuarioRepository.findByEmail(string);
	}
}
