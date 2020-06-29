package br.com.tts.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PesquisarClientesSteps {

	@Given("^estou logado na aplicação$")
	public void estouLogadoNaAplicação() throws Throwable {
	}

	@When("^informo usuário com cadastro inativo \"([^\"]*)\" e confirmo$")
	public void informoUsuárioComCadastroInativoEConfirmo(String arg1) throws Throwable {
	}

	@Then("^exibe mensagem \"([^\"]*)\"$")
	public void exibeMensagem(String arg1) throws Throwable {
	}

	@When("^pesquiso cliente ativo \"([^\"]*)\"$")
	public void informoUsuárioComCadastroAtivoEConfirmo(String arg1) throws Throwable {
	}
}