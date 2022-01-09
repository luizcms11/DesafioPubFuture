<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>PubFuture - Finanças</title>
  <link rel='stylesheet' href='https://cdn.rawgit.com/picturepan2/spectre/846353cb/docs/dist/spectre.min.css'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="./css/style.css">

</head>
<body>
<!-- partial:index.partial.html -->
<div class="lateral-nav">
  <div class="lateral-top-nav">
    <div class="user-info">
      <div class="user-pic">
        <div class="round-img">
          <img src="https://avatars.githubusercontent.com/u/34714882?v=4">
        </div>
      </div>
      <div class="user-desc">
        <div class="first-info">
          <p>Bom dia,</p>
        </div>
        <div class="second-info">
          <p>{username}</p>
        </div>
      </div>
    </div>
  </div>
  <div class="lateral-body-nav">
    <ul>
      <li><i class="fa fa-money" aria-hidden="true"></i> <span>Receitas</span></li>
      <li><i class="fa fa-credit-card" aria-hidden="true"></i><span>Despesas</span></li>
      <li><i class="fa fa-university" aria-hidden="true"></i><span>Contas</span></li>
      <li style="margin-top:80px"><i class="fa fa-sign-out" aria-hidden="true"></i><span>Sair</span></li>
    </ul>
  </div>
</div>
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

  <section class="page-section" id="tabelaReceitas">
    <div class="container">
        <div class="text-center">
            <h2 class="section-heading text-uppercase">Receitas</h2>
            
        </div>

        <button title="Editar" id="btnAdicionarReceita" onclick="window.location.href='formreceita'" class="btn btn-success mb-3"  type="button">
          <i class="fa fa-plus"></i> 
          Nova Receita 
      </button>
      
        <table>
          <tr>
            <th>Valor</th>
            <th>Data de Recebimento</th>
            <th>Data de Recebimento Esperado</th>
            <th>Descrição</th>
            <th>Instituição Financeira</th>
            <th>Conta a Receber</th>
            <th>Tipo de Receita</th>
            <th>Ações</th>
          </tr>

          <tr>
            <td>R$ 839,23</td>
            <td></td>
            <td>10/02/2022</td>
            <td>Reembolso de despesas</td>
            <td>Itaú</td>
            <td>Conta Corrente</td>
            <td>Outros</td>
            <td><button id="btnEditar" type="button" class="btn btn-success mb-3"><i class="fa fa-pencil-square-o"></i></button> <button id="btnDeletar" type="button" class="btn btn-success mb-3"><i class="fa fa-trash-o"  ></i></button></td>
          </tr>
        </table>
         
    </div>
  </section>







</div>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script><script  src="./js/script.js"></script>

</body>
</html>
