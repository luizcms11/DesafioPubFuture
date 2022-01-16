package br.com.pubf.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.olimposistema.aipa.dao.DAO;
import br.com.pubf.interceptors.SomenteLogado;
import br.com.pubf.model.Contas;

@Controller
@Path("deletaconta")
public class DeletaContaController {
	
	@Inject DAO<Contas> contasDao;
	@Inject Result result;
	
	
	@Get("/{contas.id}") @SomenteLogado
	public void deletaconta(Contas contas) {
		
		contasDao.delete(contas);
		result.redirectTo(ContasController.class).contas();
		
	}

}
