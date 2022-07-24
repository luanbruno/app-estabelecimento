package br.edu.infnet.appestabelecimento.model.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appestabelecimento.model.domain.AcessoUser;

@Repository
public class UsuarioDao implements UserDetailsService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		AcessoUser acessoUser = usuarioRepository.findByEmail(username);
		
		if(acessoUser ==null) {
			throw new UsernameNotFoundException("O usuário " + username + " não foi encontrado");
	
		}
		return acessoUser;
	}

}
