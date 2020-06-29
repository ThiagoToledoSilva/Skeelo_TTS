package br.com.tts.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PesquisarInformacoesClientesSteps {

	@Then("^exibe status \"([^\"]*)\" do cliente$")
	public void exibeStatusDoCliente(String arg1) throws Throwable {
	}

	@Then("^exibe empresa \"([^\"]*)\" do cliente$")
	public void exibeEmpresaDoCliente(String arg1) throws Throwable {
	}

	@Then("^exibe telefone (\\d+) (\\d+) (\\d+) (\\d+) do cliente$")
	public void exibeTelefoneDoCliente(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	}

	@Then("^exibe email \"([^\"]*)\" do cliente$")
	public void exibeEmailDoCliente(String arg1) throws Throwable {
	}

	@Then("^exibe localização \"([^\"]*)\" do cliente$")
	public void exibeLocalizaçãoDoCliente(String arg1) throws Throwable {
	}

	@When("^exibe atividades em atraso (\\d+) do cliente$")
	public void exibeAtividadesEmAtrasoDoCliente(int arg1) throws Throwable {
	}

	@When("^exibe atividades em andamento (\\d+) do cliente$")
	public void exibeAtividadesEmAndamentoDoCliente(int arg1) throws Throwable {
	}

	@When("^exibe atividades previstas (\\d+) do cliente$")
	public void exibeAtividadesPrevistasDoCliente(int arg1) throws Throwable {
	}

	@When("^exibe atividades concluídas (\\d+) do cliente$")
	public void exibeAtividadesConcluídasDoCliente(int arg1) throws Throwable {
	}

	@Then("^exibe total de atividades <opp_tot> do cliente igual à soma das atividades em atraso, em andamento, previstas e comcluídas$")
	public void exibeTotalDeAtividadesOpp_totDoClienteIgualÀSomaDasAtividadesEmAtrasoEmAndamentoPrevistasEComcluídas() throws Throwable {
	}

	@When("^exibe oportunidades ganhas (\\d+) do cliente$")
	public void exibeOportunidadesGanhasDoCliente(int arg1) throws Throwable {
	}

	@When("^exibe oportunidades perdidas (\\d+) do cliente$")
	public void exibeOportunidadesPerdidasDoCliente(int arg1) throws Throwable {
	}

	@When("^exibe oportunidades abertas (\\d+) do cliente$")
	public void exibeOportunidadesAbertasDoCliente(int arg1) throws Throwable {
	}

	@When("^exibe oportunidades descartadas (\\d+) do cliente$")
	public void exibeOportunidadesDescartadasDoCliente(int arg1) throws Throwable {
	}

	@Then("^exibe total de oportunidades (\\d+) do cliente igual à soma das oportunidades ganhas, perdidas, abertas e descartadas$")
	public void exibeTotalDeOportunidadesDoClienteIgualÀSomaDasOportunidadesGanhasPerdidasAbertasEDescartadas(int arg1) throws Throwable {
	}

	@Then("^exibe limite concedido menor que limite disponível do cliente$")
	public void exibeLimiteConcedidoMenorQueLimiteDisponívelDoCliente() throws Throwable {
	}

	@When("^pesquiso cliente \"([^\"]*)\" com títulos financeiros vencidos$")
	public void pesquisoClienteComTítulosFinanceirosVencidos(String arg1) throws Throwable {
	}

	@When("^solicito aumento de limite de crédito$")
	public void solicitoAumentoDeLimiteDeCrédito() throws Throwable {
	}

	@When("^o total de títulos financeiros vencidos é maior que o total de títulos pagos$")
	public void oTotalDeTítulosFinanceirosVencidosÉMaiorQueOTotalDeTítulosPagos() throws Throwable {
	}

	@Then("^quando solicitar aumento de limite exibe mensagem impeditiva \"([^\"]*)\"$")
	public void quandoSolicitarAumentoDeLimiteExibeMensagemImpeditiva(String arg1) throws Throwable {
	}
}