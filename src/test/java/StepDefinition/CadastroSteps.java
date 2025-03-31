package StepDefinition;

import io.cucumber.java.pt.E;
import pages.CadastroPage;
import utility.TestContext;

public class CadastroSteps {

    private CadastroPage cadastroPage;

    public CadastroSteps(TestContext testContext) {
        this.cadastroPage = new CadastroPage(testContext);
    }

        @E("Na proxima pagina seleciono a opcao Criar meu Cadastro novamente")
        public void na_proxima_pagina_seleciono_a_opcao_criar_meu_cadastro_novamente() {
            cadastroPage.ClicarCriarMeuCadastro();
        }
}

