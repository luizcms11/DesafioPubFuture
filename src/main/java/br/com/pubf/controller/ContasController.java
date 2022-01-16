package br.com.pubf.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.olimposistema.aipa.dao.DAO;
import br.com.pubf.interceptors.SomenteLogado;
import br.com.pubf.model.Contas;

@Controller
@Path("contas")
public class ContasController {
	
	@Inject Result result;
	@Inject DAO<Contas> contasDao;

	@Get("") @SomenteLogado
	public void contas() {
		List<Contas> contas = contasDao.selectAll();
		result.include("contas", contas);
	}
}
