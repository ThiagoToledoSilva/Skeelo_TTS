@tag_acessos
Feature: Acesso ao sistema

  Como usuário cadastrado no sistema de Clientes 
  Eu quero acessar-lo com meu usuário e senha
  Para utilizar as funcionalidades

  Scenario: Acessar a aplicação
    Given que informo a URL "<https://aplicação.clientes.com/login>" no browser
    When abro o browser
    Then exibe tela para informar usuário e senha

  Scenario: Logar na aplicação
  	Given estou na tela de login
    When informo usuário "user" e senha "passwd" e confirmo
    Then acesso o sistema de Clientes