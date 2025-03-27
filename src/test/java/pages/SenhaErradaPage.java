package pages;

import utility.Actions;
import utility.TestContext;

public class SenhaErradaPage {

    private Actions actions;

    public SenhaErradaPage(TestContext testContext) {
        this.actions = new Actions(testContext); // Passa o TestContext para Actions
    }

    public void validarPagina(String titulo) {
          actions.validarPaginaSenhaErrada(titulo);
    }

    public void validarMensagemDadosErrados() {
            actions.validaMensagemDadosErrados();
    }
}
