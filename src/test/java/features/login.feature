#language: pt

  @Login
  Funcionalidade: Usuario ja existente se logando no site

    Contexto:
      Dado que estou na tela inicial
      E clico em Efetuar Login


     @Positivo
     Cenario: Validar usuario está logado na homepage
       Quando Preencher os dados de email e senha "koichi6816@uorak.com" "Teste1234"
       Então Verei meu nick na tela inicial "Teste Teste"

      @Negativo
      Cenario: Tentar logar passando valores errados
       Quando Preencher os dados de email e senha com valores errados "koichi6816@uorak.com" "12345"
       Então Serei redirecionado para outra tela
       E Tera uma mensagem de Login ou Senha errados