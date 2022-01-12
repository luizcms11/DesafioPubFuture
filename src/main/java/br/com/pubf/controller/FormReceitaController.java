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
import br.com.olimposistema.aipa.service.Util;
import br.com.pubf.model.Receitas;

@Controller
@Path("formreceita")
public class FormReceitaController {

	@Inject Validator validator;
	@Inject DAO<Receitas> receitasDao;
	@Inject Result result;
	
	@Get("")
	public void formreceita(Receitas receitas) {
		if(Util.isNotNull(receitas) && Util.isPositivo(receitas.getId())){
			Receitas receitaDoBanco = receitasDao.selectPorId(receitas);
			result.include("receitas", receitaDoBanco);
			
		}
		
	}
	
	@IncludeParameters
	@Post("salvaReceitas")
	public void salvaReceitas(@Valid Receitas receitas) {
		validator.onErrorRedirectTo(this).formreceita(receitas);
		receitasDao.insertOrUpdate(receitas);
		result.redirectTo(ReceitasController.class).receitas();
	}
}
