
# Desafio PubFuture

Este projeto foi desenvolvido para o desafio PubFuture com o objetivo de criar um sistema para gerenciamento de finanças pessoais.


</br>
</br>

### 📋 Pré-requisitos

* PostgreSQL versão 9.6.19
* IDE Eclipse IDE 2021-12
* Java versão 17.0.1
*Tomcat 9.0

</br>
</br>

### 🔧 Instalação

* Baixe os arquivos do respositório 'master'
* Salve as pastas e arquivos no workplace da IDE Eclipse
* No menu 'File', clique em 'Import'
* Escolha a opção 'Existing Maven Projects' e clique em 'Next'
* Clique em 'Browse...' e selecione a pasta com os arquivos do repositório (passo 1) que foi salvo no seu computador
* Clique em 'Select All' para importar os requisitos do projeto
* Clique em 'Finish'
* Na aba 'Project Explorer', selecione 'JPA Content' e dê dois cliques em 'persistence.xml'
* Clique na aba 'Source'
* Modifique estas duas linhas do código, conforme o nome da base de dados que você criar e a senha de acesso ao seu PostgreSQL:

```
property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost/NOME_DA_SUA_DATABASE" /> <!-- 167.114.67.6 -->
```

```
<property name="javax.persistence.jdbc.password" value="SUA_SENHA_DE_ACESSO" /> <!-- DB Password -->
```


</br>
</br>

## ✒️ Autor

Luiz Maciel (https://github.com/luizcms11)






