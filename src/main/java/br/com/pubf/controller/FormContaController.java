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
import br.com.pubf.model.Contas;


@Controller
@Path("formconta")
public class FormContaController {

	@Inject Validator validator;
	@Inject DAO<Contas> contasDao;
	@Inject Result result;
	
	@Get("")
	public void formconta(Contas contas) {
		if(Util.isNotNull(contas) && Util.isPositivo(contas.getId())) {
			Contas contasDoBanco = contasDao.selectPorId(contas);
			result.include("contas", contasDoBanco);
		}
		
		
	}
	
	@IncludeParameters
	@Post("salvaContas")
	public void salvaContas(@Valid Contas contas) {
		validator.onErrorRedirectTo(this).formconta(contas);
		contasDao.insertOrUpdate(contas);
		result.redirectTo(ContasController.class).contas();
	}
		
		
	}
	

