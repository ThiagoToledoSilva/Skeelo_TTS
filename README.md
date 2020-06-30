# Skeelo_TTS
Skeelo QA Challenge - Thiago Toledo (thiagotol@gmail.com)

## Início

Para executar o projeto (front-end):

- 1o via Eclipse - Version: 2020-03 (4.15.0):
	Importar Projeto (MAVEN) e executar a classe "/src/test/java/br/com/tts/runners/Runner.java" como JUnit Test

- 2o via Maven - Version Apache Maven (3.6.3)
	Clonar Repositório Remoto (Github https://github.com/ThiagoToledoSilva/Skeelo_TTS.git) para Repositório Local.

	Executar por terminal (CMD) com os comandos:
	cd C:\Users\Thiago Toledo\git\Skeelo_TTS1\Skeelo_TTS (diretório do arquivo POM.xml)
	MVN CLEAN COMPILE
	MVN TEST

## 1. Testing Scenarios

	Consultar Features (Gherkin) nos diretórios:

	01_acesso_sistema.feature (src\test\resources\features\01_acesso_sistema.feature).
	02_pesquisar_clientes.feature (src\test\resources\features\02_pesquisar_clientes.feature).
	03_pesquisar_info_clientes.feature (src\test\resources\features\03_pesquisar_info_clientes.feature).
	04_navegacao.feature (src\test\resources\features\04_navegacao.feature).
	05_seguranca.feature (src\test\resources\features\05_seguranca.feature).

## 2. Automation of 1 front-end functionalities

	Executar via Maven (informações no início) ou executar a classe: src\test\java\br\com\tts\runners\Runner.java
	como JUnit.

	A classe Runner.java os cenários da Feature: 06_clicar_elementos_tela.feature (src\test\resources\features que 
	chama os métodos da classes: ClicarBotoesSteps.java.

	Evidências dos Testes geradas em: target\Evidencias dos Testes.
	Relatório dos Testes gerados em: target\Json e target\Relatorio-html.
		
## 3. Automation of 1 back-end functionality

	Executar as classes via Eclipse pelo JUnit:

	src\test\java\br\com\tts\rest\Get.java (Json Schema: src\test\resources\users.json)
	src\test\java\br\com\tts\rest\Post.java
	src\test\java\br\com\tts\rest\Put.java
	src\test\java\br\com\tts\rest\Delete.java
