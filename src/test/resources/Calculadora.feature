# language: pt

  Funcionalidade: Realizar as 4 operações aritméticas e retorna o resultado

    Cenário: Soma de 2 números - caso 1
      Quando o usuário somar os valores 1 e 2
      Então o número 3 é retornado

    Cenário: Soma de 2 números - caso 2
      Quando o usuário somar os valores 2 e 2
      Então o número 4 é retornado

    Cenário: Soma com número na memória
      Dado que a calculadora tem o número 5 na memória
      Quando o usuário fornecer o número 2 para soma com o número na memória
      Então o número 7 é retornado

    Cenário: Subtração com número na memória
      Dado que a calculadora tem o número 10 na memória
      Quando o usuário fornecer o número 2 para subtrair com o número na memória
      Então o número 8 é retornado

    Cenário: Divisão com números no JSON
      Quando o JSON tiver o seguinte formato de entrada:
      """
      {
        "n1" : 10,
        "n2" : 2,
        "operacao" : "divisao"
      }
      """
      Então o número 5 é retornado

    Cenário: Divisão com números no JSON -caso 2
      Quando o JSON tiver o seguinte formato de entrada:
      """
      {
        "n1" : 12,
        "n2" : 3,
        "operacao" : "divisao"
      }
      """
      Então o número 4 é retornado

    Cenário: Soma todos os números da tabela
      Quando a tabela conter os valores:
        | 20 |
        | 30 |
      Entao o número 50 é retornado