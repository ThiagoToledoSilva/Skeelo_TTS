package br.com.tts.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/06_clicar_elementos_tela.feature",
		glue = "br.com.tts.steps",
		tags = "~@ignore",
		plugin = {"pretty", "html:target/Relatorio-html", "json:target/Json/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)

public class Runner {

}