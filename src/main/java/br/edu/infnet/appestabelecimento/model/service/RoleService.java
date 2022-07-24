package br.edu.infnet.appestabelecimento.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appestabelecimento.model.domain.Role;
import br.edu.infnet.appestabelecimento.model.repository.RoleRepository;
@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository; 

	public List<Role> obterLista(){
		return (List<Role>) roleRepository.findAll();
	}
	
	public void incluir(Role role) {
		roleRepository.save(role);
	}
		
	public Role obterPornome(String nome) {
		return roleRepository.findByNome(nome);
		
	}

}
