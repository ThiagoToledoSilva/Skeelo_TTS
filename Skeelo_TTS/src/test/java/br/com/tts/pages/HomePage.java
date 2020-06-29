package br.com.tts.pages;

import static br.com.tts.configs.DriverManager.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

	ForPages forPage = new ForPages();
	
	public void clicarBotao1() throws Throwable {
		forPage.clickButton("//a[starts-with(@class,'button')][1]");
	}
	public void clicarBotao2() throws Throwable {
		forPage.clickButton("//a[starts-with(@class,'button')][2]");
	}
	public void clicarBotao3() throws Throwable {
		forPage.clickButton("//a[starts-with(@class,'button')][3]");
	}
	public String textoBotao1() {
		return forPage.getText("//a[starts-with(@class,'button')][1]");
	}
	public String textoBotao2() {
		return forPage.getText("//a[starts-with(@class,'button')][2]");
	}
	public String textoBotao3() {
		return forPage.getText("//a[starts-with(@class,'button')][3]");
	}
	public List<WebElement> obterListEdit() {
		return getDriver().findElements(By.xpath("//td/a[@href='#edit']"));
	}
	public List<WebElement> obterListDelete() {
		return getDriver().findElements(By.xpath("//td/a[@href='#delete']"));
	}
}