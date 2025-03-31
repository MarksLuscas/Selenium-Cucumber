package pages;

import utility.Actions;
import utility.TestContext;

public class CadastroPage {

    private Actions actions;

    public CadastroPage(TestContext testContext) {
        this.actions = new Actions(testContext);
    }

    public void ClicarCriarMeuCadastro() {
        actions.clicarCriarMeuCadastro();
    }
}
