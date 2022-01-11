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

  <section class="page-section" id="tabelaDespesas">
    <div class="container">
        <div class="text-center">
            <h2 class="section-heading text-uppercase">Despesas</h2>
            
        </div>

        <button title="Editar" id="btnAdicionarDespesa" onclick="window.location.href='formdespesa'" class="btn btn-success mb-3"  type="button">
          <i class="fa fa-plus"></i> 
          Nova Despesa 
      </button>
      
        <table>
          <tr>
            <th>Valor</th>
            <th>Data de Pagamento</th>
            <th>Data de Pagamento Esperado</th>
            <th>Tipo da Despesa</th>
            <th>Instituição Financeira</th>
            <th>Conta a Debitar</th>
            <th>Ações</th>
          </tr>
			
			<c:forEach var="despesas" items="${despesas}">
			
			
			  <tr>
	            <td>${despesas.valordespesa}</td>
	            <td>${despesas.datapag}</td>
	            <td>${despesas.datapagesperado}</td>
	            <td>${despesas.tipodespesa}</td>
	            <td>${despesas.fin}</td>
	            <td>${despesas.conta}</td>
	            <td><button id="btnEditar" type="button" class="btn btn-success mb-3"><i class="fa fa-pencil-square-o"></i></button> <button id="btnDeletar" type="button" class="btn btn-success mb-3"><i class="fa fa-trash-o"  ></i></button></td>
	          <tr>
			
			
			</c:forEach>
                       
         
        </table>
         
    </div>
  </section>







</div>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script><script  src="./js/script.js"></script>

</body>
</html>
