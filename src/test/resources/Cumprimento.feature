# language: pt

  Funcionalidade: Fazer um cumprimento dependendo do comhecimento sobre a pessoa
    Para que eu fique mais contente
    Como um cara carente
    Eu quero receber o cumprimento personalizado

  Cenário: Um cumprimento simples
    Dado que eu não conheço o "Cassiano"
    E o "Cassiano" parece ser meio esquisito
    Quando recebo o nome "Cassiano"
    Então digo "Olá, Cassiano"


    Cenário: Um cumprimento saudoso
      Dado que eu conheço o "Cassiano"
      E que não vejo o "Cassiano" há "12" meses
      Quando recebo o nome "Cassiano"
      Então digo "Olá, Cassiano! Mas quanto tempo!"
