package br.com.tts.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SegurancaInvalidosSteps {

	@When("^pesquiso Atividades com comando javascript \"([^\"]*)\"$")
	public void pesquisoAtividadesComComandoJavascript(String arg1) throws Throwable {
	}

	@Then("^nao permite pesquisar$")
	public void naoPermitePesquisar() throws Throwable {
	}

	@When("^pesquiso Atividades com caracteres invalidos \"([^\"]*)\"$")
	public void pesquisoAtividadesComCaracteresInvalidos(String arg1) throws Throwable {
	}
}