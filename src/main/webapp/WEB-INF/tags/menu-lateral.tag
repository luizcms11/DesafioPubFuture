<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


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
          ${usuarioLogado.getNome() }
        </div>
      </div>
    </div>
  </div>
  <div class="lateral-body-nav">
    <ul>
      <li><a href="<c:url value="receitas"/>"><i class="fa fa-money" aria-hidden="true"></i><span>Receitas</span></a></li>
      <li><a href="<c:url value="despesas"/>"><i class="fa fa-credit-card" aria-hidden="true"></i><span>Despesas</span></a></li>
      <li><a href="<c:url value="contas"/>"><i class="fa fa-university" aria-hidden="true"></i><span>Contas</span></a></li>
      <li style="margin-top:80px"><i class="fa fa-sign-out" aria-hidden="true"></i><span>Sair</span></li>
    </ul>
  </div>
</div>
<script  src="./js/script.js"></script>