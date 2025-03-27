#language: pt

  Funcionalidade: Login
    Realizar suite de teste de login

    @LoginSucesso
    Cenario: Login com sucesso
      Dado que o usuario esteja na tela de login
      Quando preencher os campos com dados validos
      Entao o sistema direcionara para tele my account