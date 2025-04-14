#language: pt

  Funcionalidade: Login
    Realizar suite de teste de login

    @LoginSucesso
    Cenario: Login com sucesso
      Dado que o usuario esteja na tela de autenticacao
      Quando preencher os campos com dados validos
      Entao o sistema direcionara para tela my account

    @LoginFalhou
    Esquema do Cenario: Realizar os teste de "<fluxo>" de excecao de login
      Dado que o usuario esteja na tela de autenticacao
      Quando preencher o campo email "<email>" e o campo senha "<senha>"
      Entao o sistema mostrara uma mensagem "<mensagem>" de erro

      Exemplos:
        | fluxo                           | email                 | senha | mensagem                   |
        | Login com campo email em branco |                       | 12345 | An email address required. |
        | Login com email incorreto       | 123testando@teste.net | 12345 | Authentication failed.     |
        | Login com campo senha em branco | testando123@teste.com |       | Password is required.      |
        | Login com senha incorreta       | testando123@teste.com | 54321 | Authentication failed.     |
