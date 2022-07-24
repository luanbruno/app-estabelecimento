package br.edu.infnet.appestabelecimento.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appestabelecimento.model.domain.AcessoUser;

@Repository
public interface UsuarioRepository extends CrudRepository<AcessoUser, Integer> {

	AcessoUser findByEmail(String email);

}
