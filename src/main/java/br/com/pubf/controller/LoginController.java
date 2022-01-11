package br.com.pubf.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;

import br.com.pubf.dao.UsuarioDAO;
import br.com.pubf.model.Usuario;


@Controller
@Path("login")
public class LoginController {

	@Inject Result result;
	@Inject Validator validator;
	@Inject UsuarioDAO usuarioDao;
	@Inject HttpSession session;
	
	@Get("")
	public void login() {
		
	}
	
	@IncludeParameters
	@Post("autenticar")
	public void autenticar(@NotEmpty String email, @NotEmpty String senha) {
		
		validator.onErrorRedirectTo(this).login();
		
		Usuario usuario = usuarioDao.existeUsuarioCom(email,senha);
		validator.addIf(usuario == null, new SimpleMessage("error", "Email ou Senha Inválidos"));
		validator.onErrorRedirectTo(this).login();
		
		session.setAttribute("usuarioLogado", usuario);
		
		result.redirectTo(ReceitasController.class).receitas();
		
	}
}
