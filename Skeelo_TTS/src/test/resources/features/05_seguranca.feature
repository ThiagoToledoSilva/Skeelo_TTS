@tag_seguranca @tag_invalidos
Feature: Validacao Cross Site Scripting (XSS)
  Como usuário do sistema de Clientes
  Eu quero inserir comandos javascript e valores invalidos
  Para garantir seguranca e estabilidade no acesso
  
Background: 
		Given acesso ao sistema
		And estou logado  

  Scenario: Pesquisar com comandos JavaScript 
    When pesquiso Atividades com comando javascript "<alert(“comando javascript”);>"
    Then nao permite pesquisar 

  Scenario: Pesquisar com caracteres invalidos 
    When pesquiso Atividades com caracteres invalidos "<!@#$>"
    Then nao permite pesquisar 

