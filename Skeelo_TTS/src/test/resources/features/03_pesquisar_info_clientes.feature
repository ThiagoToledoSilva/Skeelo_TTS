@tag_clientes
Feature: Pesquisa de Informações de Clientes
  
  Como usuário do sistema de Clientes
  Eu quero fazer consultas
  Para encontrar Clientes com diferentes caracteristicas

  Background: 
    Given estou logado na aplicação

  Scenario Outline: Pesquisa informações Gerais dos Clientes
    When pesquiso cliente ativo "<clie>"
    Then exibe status "<status_clie>" do cliente
    And exibe empresa "<empresa_clie>" do cliente
    And exibe telefone <telefone_clie> do cliente
    And exibe email "<email_clie>" do cliente

    Examples: 
      | clie             | status_clie | empresa_clie | telefone_clie  | email_clie        |
      | Justine Robinson | Ativo       | Acme Inc     | 45 9 9555 5555 | justine@email.com |
      | clie02           | Ativo       | Emp02        | 45 9 9111 1111 | clie02@email.com  |

  Scenario Outline: Informar Clientes sem Localidade cadastrada
    When pesquiso cliente ativo "<clie>"
    And não exibe local cadastrado
    Then exibe alerta "<Cadastrar endereço.>" em tela

    Examples: 
      | clie             |
      | Justine Robinson |
      | clie02           |

  Scenario Outline: Valida Total de Atividade dos Clientes
    When pesquiso cliente ativo "<clie>"
    And exibe atividades em atraso <act_del> do cliente
    And exibe atividades em andamento <act_run> do cliente
    And exibe atividades previstas <act_pre> do cliente
    And exibe atividades concluídas <act_com> do cliente
    Then exibe total de atividades <opp_tot> do cliente igual à soma das atividades em atraso, em andamento, previstas e comcluídas

    Examples: 
      | clie             | act_tot | act_del | act_run | act_pre | act_com |
      | Justine Robinson |      25 |       1 |       0 |       3 |      21 |
      | clie02           |      21 |       3 |       1 |       2 |      15 |

  Scenario Outline: Valida Total de Oportunidades dos Clientes
    When pesquiso cliente ativo "<clie>"
    And exibe oportunidades ganhas <opp_won> do cliente
    And exibe oportunidades perdidas <opp_miss> do cliente
    And exibe oportunidades abertas <opp_open> do cliente
    And exibe oportunidades descartadas <opp_disc> do cliente
    Then exibe total de oportunidades <opp_tot> do cliente igual à soma das oportunidades ganhas, perdidas, abertas e descartadas

    Examples: 
      | clie             | opp_tot | opp_won | opp_miss | opp_open | opp_disc |
      | Justine Robinson |       7 |       4 |        1 |        2 |        0 |
      | clie02           |       5 |       1 |        2 |        1 |        1 |

  Scenario Outline: Valida Limite de Crédito dos Clientes
    When pesquiso cliente ativo "<clie>"
    Then exibe limite concedido menor que limite disponível do cliente

    Examples: 
      | clie             |
      | Justine Robinson |
      | clie02           |

  Scenario Outline: Bloquieo de Aumento de Limite de Crédito com Títulos Financeiros Vencidos
    When pesquiso cliente "<clie>" com títulos financeiros vencidos
    And solicito aumento de limite de crédito
    And o total de títulos financeiros vencidos é maior que o total de títulos pagos
    Then quando solicitar aumento de limite exibe mensagem impeditiva "Não é possível aumento limite com títulos vencidos."

    Examples: 
      | clie             |
      | Justine Robinson |
      | user02           |
