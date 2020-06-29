package br.com.tts.pages;

import static br.com.tts.configs.DriverManager.getDriver;

import org.openqa.selenium.By;

public class ForPages {
	
	/*** Obter Texto ***/
	
	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}
	public String getText(String xpath) {
		return getText(By.xpath(xpath));
	}

	public String getTextXpath(String id) {
		return getText(By.id(id));
	}
	
	/*** Botao ***/
	
	public void clickButton(By by) {
		getDriver().findElement(by).click();
	}
	public void clicarBotaoPorXpath(String xpath) {
		clickButton(By.xpath(xpath));
	}
	public void clickButton(String texto) {
		clickButton(By.xpath(texto));
	}
	public void clicarBotao(String id) {
		clickButton(By.id(id));
	}
	public void clicarBotaoPorTexto(String texto) {
		clickButton(By.xpath("//button[.='"+texto+"']"));
	}
	public String obterValueElemento(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}
	
	/*** Link ***/
	
	public void clicarLinks(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}

}
