package br.com.pubf.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.pubf.model.Usuario;

@Controller
@Path("cadastro")
public class CadastroController {

	@Inject EntityManager em;
	@Inject Result result;
	
	@Get("")
	public void cadastro() {
		
	}
	
	@Post("salvaUsuario")
	public void salvaUsuario (Usuario usuario) {
		
		em.persist(usuario);
		result.redirectTo(LoginController.class).login();
	}
}
