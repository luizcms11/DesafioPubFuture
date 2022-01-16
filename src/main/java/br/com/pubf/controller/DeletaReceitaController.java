package br.com.pubf.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.olimposistema.aipa.dao.DAO;
import br.com.pubf.interceptors.SomenteLogado;
import br.com.pubf.model.Receitas;

@Controller
@Path("deletareceita")
public class DeletaReceitaController {

	@Inject DAO<Receitas> receitaDao;
	@Inject Result result;
	
	@Get("/{receitas.id}") @SomenteLogado
	public void deletareceita(Receitas receitas) {
		
		receitaDao.delete(receitas);
		result.redirectTo(ReceitasController.class).receitas();
		
	}
}
