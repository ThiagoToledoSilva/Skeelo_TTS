@tag_navegacao
Feature: Navegar no Sistema
  Como usuário do sistema de Clientes
  Eu quero navegar pela tela
  Para acessar aplicativos e redes sociais
  
Background: 
		Given acesseo ao sistema
		And estou logado  

  Scenario: Abrir links das redes sociais
    When clico no link do WhatsApp
    Then abre o aplicativo
    When clico no link do Facebook
    Then abre o aplicativo
    When clico no link do Instagram
    Then abre o aplicativo
    When clico no link do Twitter
    Then abre o aplicativo
    When clico no link do Linkedin
    Then abre o aplicativo

  Scenario: Visuzalir todas oportunidades
    When clico em Ver Todas Oportunidades
    Then exibe todas Oportunidades

  Scenario: Adicionar Grádfico de Vendas
    When clico em Adicionar um Gráfico Aqui
    Then exibe Gráfico de vendas
    
  Scenario: Pesquisar Atividades
    When pesquiso Atividade cadastrada
    Then exibe Atividade pesquisada
