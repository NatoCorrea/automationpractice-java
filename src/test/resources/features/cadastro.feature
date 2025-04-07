#language: pt

  Funcionalidade: Cadastro

    Cenario: Realizar cadastro com email já cadastrado
      Dado que o usuario esteja na tela de autenticacao
      Quando ele preenche o campo email e clica no botao de cadastrar
      Entao o sistema retorna uma mensagem de erro
