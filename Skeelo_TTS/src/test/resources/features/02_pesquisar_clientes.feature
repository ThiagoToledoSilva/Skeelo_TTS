@tag_clientes
Feature: Pesquisa de Clientes

  Como usuário do sistema de Clientes
  Eu quero fazer consultas
  Para encontrar Clientes com diferentes caracteristicas

  Background: 
    Given estou logado na aplicação

  Scenario: Pesquisar usuário inativo
    When informo usuário com cadastro inativo "clie_inactive" e confirmo
    Then exibe mensagem "Usuario desativado"

  Scenario Outline: Pesquisar usuário ativo
    When pesquiso cliente ativo "<clie>"
    Then exibe mensagem "Acesso Ok"

    Examples: 
      | clie			  | 
      | clie01			|
      | clie02      |
