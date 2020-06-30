package br.com.tts.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PesquisarClientesSteps {

	@Given("^estou logado na aplicação$")
	public void estouLogadoNaAplicacao() throws Throwable {
	}

	@When("^informo usuário com cadastro inativo \"([^\"]*)\" e confirmo$")
	public void informoUsuarioComCadastroInativoEConfirmo(String arg1) throws Throwable {
	}

	@Then("^exibe mensagem \"([^\"]*)\"$")
	public void exibeMensagem(String arg1) throws Throwable {
	}

	@When("^pesquiso cliente ativo \"([^\"]*)\"$")
	public void informoUsuarioComCadastroAtivoEConfirmo(String arg1) throws Throwable {
	}
}