#language: pt

  Funcionalidade: Realizar suite de testes na pagina My Account

#    Cenario: Acessar pagina de adicionar meu primeiro endereco
#    Cenario: Acessar pagina de historico de pedidos
#    Cenario: Acessar pagina de meus comprovantes de creditos
#    Cenario: Acessar pagina meu endereco
#    Cenario: Acessar pagina de informacoes pessoais


    @AcessarMyFirstAdress
    Cenario: Acessar pagina de adicionar endereco
      Dado que o usuario esteja logado e na My Account Page
      Quando clicar no botao  Add my first addres
      Entao o sistema redirecionara para pagina de cadastro de enderecos

  @AcessarOrderHistory
  Cenario: Acessar pagina de historico de pedidos
    Dado que o usuario esteja logado e na My Account Page
    Quando clicar no botao Order history and details
    Entao o sistema redirecionara para pagina de historico de pedidos

  @AcessarMyCreditSlips
  Cenario: Acessar a pagina de creditos
    Dado que o usuario esteja logado e na My Account Page
    Quando clicar no botao My credit slips
    Entao o sistema redirecionara para a pagina de creditos

  @AcessarMyAdress
  Cenario: Acessar pagina de meu endereco
    Dado que o usuario esteja logado e na My Account Page
    Quando clicar no botao My addres
    Entao o sistema redirecionara para pagina de enderecos

  @AcessarMyPersonalInformation
  Cenario: Acessar pagina de informacoes pessoais
    Dado que o usuario esteja logado e na My Account Page
    Quando clicar no botao My personal information
    Entao o sistema redirecionara para a pagina de informacoes pessoais


#      Exemplos:
#        | fluxo                        |
#        | Acessar Add My First Address |
#        | Acessar Order History And Details |
#        | My Credit Slipls                  |
#        | My Adress                         |
#        | My Personal Information           |