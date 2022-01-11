package br.com.pubf.controller;

import javax.inject.Inject;

import java.util.List;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.olimposistema.aipa.dao.DAO;
import br.com.pubf.model.Despesas;

@Controller
@Path("despesas")
public class DespesasController {

	@Inject Result result;
	@Inject DAO<Despesas> despesasDao;
	
	@Get("")
	public void despesas() {
		List<Despesas> despesas = despesasDao.selectAll();
		result.include("despesas", despesas);
		
	}
}
