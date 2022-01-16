<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 



<!DOCTYPE html>
<html lang="pt-br" >
<head>
  <meta charset="UTF-8">
  <title>PubFuture - Finanças</title>
  <link rel='stylesheet' href='https://cdn.rawgit.com/picturepan2/spectre/846353cb/docs/dist/spectre.min.css'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="./css/style.css">

</head>
<body style="background-color: #343546;">
<!-- partial:index.partial.html -->

<header class="content-login" id="cadastro">
  <div class="container">
      <div class="masthead-subheading"><h1>Bem Vindo à  PubFuture Finanças!</h1></div>
      <div class="masthead-heading text-uppercase" id="login-box"><h6>Faça seu Cadastro:</h6></div>
      
      <c:if test="${not empty erros}">
      	<div class="alert alert-danger" role="alert">
      	<c:forEach var="error" items="${errors}">
      		${error.message}<br/>
      	</c:forEach>
      	</div>
      </c:if>
      
      <form method="post" action="<c:url value="cadastro/salvaUsuario"/>">
          <div class="row justify-content-md-center mb-5 text-center">
              <div class="col-md-12 align-self-center text-center">
              	  <div class="form-group input-login mx-auto">
                      <input name="usuario.nome" class="form-control" id="nome" placeholder="Nome *" required="required"  data-validation-required-message="Insira seu nome." />
                      <p class="help-block text-danger"></p>
                  </div>
                  <div class="form-group input-login mx-auto">
                      <input name="usuario.email" class="form-control" id="email" type="email" placeholder="Email *" required="required" data-validation-required-message="Insira seu email." />
                      <p class="help-block text-danger"></p>
                  </div>
                  <div class="form-group mb-md-0 input-login mx-auto">
                      <input name="usuario.senha" class="form-control" id="phone" type="password" placeholder="Senha *" required="required" data-validation-required-message="Insira sua senha." />
                      <p class="help-block text-danger"></p>
                  </div>
              </div>
              
          </div>
      	<button type="submit" class="btnLogin">Cadastrar</button>
      </form>
  </div>
</header>



<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script><script  src="./js/script.js"></script>

</body>
</html>
