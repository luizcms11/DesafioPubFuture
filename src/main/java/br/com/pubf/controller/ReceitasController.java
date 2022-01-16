package br.com.pubf.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.olimposistema.aipa.dao.DAO;
import br.com.pubf.interceptors.SomenteLogado;
import br.com.pubf.model.Receitas;

@Controller
@Path("receitas")
public class ReceitasController {
	
	@Inject Result result;
	@Inject DAO<Receitas> receitasDao;

	@Get("") @SomenteLogado
	public void receitas() {
		List<Receitas> receitas = receitasDao.selectAll();
		result.include("receitas", receitas);
		
	}
}
