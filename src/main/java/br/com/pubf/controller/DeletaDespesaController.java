package br.com.pubf.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.olimposistema.aipa.dao.DAO;
import br.com.pubf.model.Despesas;

@Controller
@Path("deletadespesa")
public class DeletaDespesaController {
	
	@Inject DAO<Despesas> despesasDao;
	@Inject Result result;
	
	@Get("/{despesas.id}")
	public void deletadespesa(Despesas despesas) {
		
		despesasDao.delete(despesas);
		result.redirectTo(DespesasController.class).despesas();
	}

}
