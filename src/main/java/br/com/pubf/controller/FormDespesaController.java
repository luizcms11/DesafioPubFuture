package br.com.pubf.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.validator.Validator;
import br.com.olimposistema.aipa.dao.DAO;
import br.com.pubf.model.Despesas;

@Controller
@Path("formdespesa")
public class FormDespesaController {

	@Inject Validator validator;
	@Inject DAO<Despesas> despesasDao;
	@Inject Result result;
	
	@Get("")
	public void formdespesa() {
		
	}
	
	@IncludeParameters
	@Post("salvaDespesas")
	public void salvaDespesas(@Valid Despesas despesas) {
		validator.onErrorRedirectTo(this).formdespesa();
		despesasDao.insertOrUpdate(despesas);
		result.redirectTo(DespesasController.class).despesas();
	}
	
	
}
