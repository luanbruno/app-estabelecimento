package br.edu.infnet.appestabelecimento;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appestabelecimento.model.domain.AcessoUser;
import br.edu.infnet.appestabelecimento.model.domain.Role;
import br.edu.infnet.appestabelecimento.model.service.AcessoUserService;
import br.edu.infnet.appestabelecimento.model.service.RoleService;


@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner{

	@Autowired
	private RoleService roleService;

	@Autowired
	private AcessoUserService acessoUserService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		if (roleService.obterPornome("ROLE_ADMIN") == null) {
			roleService.incluir(new Role("ROLE_ADMIN"));
		}

		if (roleService.obterPornome("ROLE_USER") == null) {
			roleService.incluir(new Role("ROLE_USER"));
		}
				
		AcessoUser usuarioA = new AcessoUser();
		usuarioA.setEmail("admin@infnet.edu.br");
		usuarioA.setNome("luan");
		usuarioA.setRoles(Arrays.asList(new Role(1)));
		usuarioA.setSenha("123");
								
		AcessoUser usuarioB = new AcessoUser();
		usuarioB.setEmail("elis@elis.com");
		usuarioB.setNome("Elis");
		usuarioB.setRoles(Arrays.asList(new Role(2)));
		usuarioB.setSenha("123");

		
		if (acessoUserService.findByEmail("admin@infnet.edu.br") == null && acessoUserService.findByEmail("elis@elis.com") == null) {
			acessoUserService.incluir(usuarioA);
			acessoUserService.incluir(usuarioB);
		}
		
				
		
	}
	

}
