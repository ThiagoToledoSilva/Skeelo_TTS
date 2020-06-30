package br.com.tts.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcessoSistemaSteps {

	@Given("^que informo a URL \"([^\"]*)\" no browser$")
	public void queInformoAURLNoBrowser(String arg1) throws Throwable {
	}
	
	@When("^abro o browser$")
	public void abroOBrowser() throws Throwable {
	}
	
	@Then("^exibe tela para informar usuario e senha$")
	public void exibeTelaParaInformarUsuarioESenha() throws Throwable {
	}

	@Given("^estou na tela de login$")
	public void estouNaTelaDeLogin() throws Throwable {
	}

	@When("^informo usuário \"([^\"]*)\" e senha \"([^\"]*)\" e confirmo$")
	public void informoUsuarioESenhaEConfirmo(String arg1, String arg2) throws Throwable {
	}

	@Then("^acesso o sistema de Clientes$")
	public void acessoOSistemaDeClientes() throws Throwable {
	}
}