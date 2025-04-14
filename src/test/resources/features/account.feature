#language: pt

  Funcionalidade: Realizar suite de testes na pagina My Account

#    Cenario: Acessar pagina de adicionar meu primeiro endereco
#    Cenario: Acessar pagina de historico de pedidos
#    Cenario: Acessar pagina de meus comprovantes de creditos
#    Cenario: Acessar pagina meu endereco
#    Cenario: Acessar pagina de informacoes pessoais


    @AcessarMyFirstAdress
    Cenario: Acessar pagina de adicionar meu primeiro endereco
      Dado que o usuario esteja logado e na My Account Page
      Quando clicar no botao  Add my first addres
      Entao o sistema redirecionara para pagina de enderecos

  @AcessarOrderHistory
  Cenario: Acessar pagina de historico de pedidos
    Dado que o usuario esteja logado e na My Account Page
    Quando clicar no botao Order history and details
    Entao o sistema redirecionara para pagina de historico de pedidos

#      Exemplos:
#        | fluxo                        |
#        | Acessar Add My First Address |
#        | Acessar Order History And Details |
#        | My Credit Slipls                  |
#        | My Adress                         |
#        | My Personal Information           |