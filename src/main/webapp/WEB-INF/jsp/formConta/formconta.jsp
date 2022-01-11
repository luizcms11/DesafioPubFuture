<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib tagdir="/WEB-INF/tags/" prefix="tag" %>


<!DOCTYPE html>
<html lang="pt-br" >
<head>
  <meta charset="UTF-8">
  <title>PubFuture - Finanças</title>
  <link rel='stylesheet' href='https://cdn.rawgit.com/picturepan2/spectre/846353cb/docs/dist/spectre.min.css'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="./css/style.css">

</head>
<body>

<tag:menu-lateral></tag:menu-lateral>


<div class="content">
  <div class="top-nav">
    <div class="top-left-side">
      <span class="menu-icon">
        <i class="fa fa-bars" aria-hidden="true"></i>
      </span>
      <h1>PubFuture - Finanças</h1>
    </div>
    <div class="top-right-side">
    </div>
  </div>
 
<!-- formconta-->
<section class="page-section" id="formConta">
  <div class="container">
      <div class="text-center">
          <h2 class="section-heading text-uppercase">Nova Conta/Editar Conta</h2>
          
      </div>
      <form method="post" action="<c:url value="formconta/salvaContas"/>">
          <div class="row justify-content-md-center mb-5 text-center">
              <div class="col-md-12 align-self-center text-center">
                  
                <div class="form-group input-login mx-auto">
                    <h6 style="margin-bottom:0px">Saldo Inicial:</h6>
                    <input name="contas.saldo" value="${contas.saldo}" class="form-control money" id="valor" type="tel" placeholder="Valor em R$*" required="required" data-validation-required-message="Digite o Saldo Inicial." />                            
                    <p class="help-block text-danger"></p>
                </div>
                
                <div class="form-group">
                  <h6 style="margin-bottom:0px">Instituição Financeira:</h6>
                  <input name="contas.fin" value="${contas.fin}" class="form-control" id="instituicaoFin"  placeholder="Nome da Instituição Financeira*" required="required" data-validation-required-message="Digite a InstituiÃ§Ã£o Financeira." />
                  <p class="help-block text-danger"></p>

                  
                </div>
                
                <div class="form-group">
                  <h6 style="margin-bottom:0px">Tipo de Conta:</h6>
                  <select name="contas.conta" class="form-control input-login mx-auto" id="email" required="required">
                    <option>Carteira</option>
                    <option>Conta Corrente</option>
                    <option>Poupança</option>
                    
                  </select>
                  <p class="help-block text-danger"></p>
                </div>

                 
                  <button type="submit" class="botão-salvar" >Salvar</button>
              </div> 
          </div>
      </form>
  </div>
</section>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script><script  src="./js/script.js"></script>

</body>
</html>
