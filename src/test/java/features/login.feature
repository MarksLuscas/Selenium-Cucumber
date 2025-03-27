#language: pt

  Funcionalidade: Usuario ja existente se logando no site

    Cenario: Validar usuario está logado na homepage
      Dado que estou na tela inicial
      E clico em Efetuar Login
      Quando Preencher os dados de email e senha "koichi6816@uorak.com" "Teste1234"
#     Então Me verei logado na tela inicial novamente