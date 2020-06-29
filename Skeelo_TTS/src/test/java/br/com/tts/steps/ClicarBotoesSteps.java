package br.com.tts.steps;

import static br.com.tts.configs.DriverManager.getDriver;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import br.com.tts.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClicarBotoesSteps {

	HomePage homePage = new HomePage();

	@Then("^exibe ordem original dos botoes$")
	public void exibeOrdemDosBotoes() throws Throwable {
	}

	@When("^exibe ordem dos botoes apos clicar no primeiro botao$")
	public void clicoNoPrimeiroBotao() throws Throwable {
		homePage.clicarBotao1();
	}

	@When("^exibe ordem dos botoes apos clicar no segundo botao$")
	public void clicoNoSegundoBotao() throws Throwable {
		homePage.clicarBotao2();
	}
	
	@When("^exibe ordem dos botoes apos clicar no terceiro botao$")
	public void clicoNoTerceiroBotao() throws Throwable {
		homePage.clicarBotao3();
	}
	
	@When("^lista edit$")
	public void listaEdit() throws Throwable {
		
		List<WebElement> resultados = homePage.obterListEdit();
		
		for (int i = 0; i < resultados.size(); i++) {
			resultados.get(i).click();
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			WebElement element = resultados.get(i);
			js.executeScript("arguments[0].style.border = arguments[1]", element, "solid 1px red");
		}
	}

	@When("^lista delete$")
	public void listaDelete() throws Throwable {
		
		List<WebElement> resultados = homePage.obterListDelete();

		for (int i = 0; i < resultados.size(); i++) {
			resultados.get(i).click();
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			WebElement element = resultados.get(i);
			js.executeScript("arguments[0].style.border = arguments[1]", element, "solid 1px red");
		}
	}
}