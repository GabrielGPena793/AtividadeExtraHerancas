# AtividadeExtraHerancas

1. Criar a classe Pessoa com as seguintes características:
a. Atributos: idade e dia, mês e ano de nascimento, nome da pessoa
b. Métodos:
i. calculaIdade(): que recebe a data atual em dias, mês e anos e
calcula e armazena no atributo idade a idade atual da pessoa
ii. informaIdade(): que retorna o valor da idade
iii. informaNome(): que retorna o nome da pessoa
iv. ajustaDataDeNascimento(): que recebe dia, mês e ano de
nascimento como parâmetros e preenche nos atributos
correspondentes do objeto.
c. A classe, os atributos e métodos devem seguir o princípio de
encapsulamento.
d. Criar dois objetos da classe Pessoa, um representando Albert Einstein
(nascido em 14/3/1879) e o outro representando Isaac Newton
(nascido em 4/1/1643) .
e. Fazer uma classe principal que instancie os objetos, inicialize e mostre
quais seriam as idades de Einstein e Newton caso estivessem vivos.
---
2. Crie a classe CarroCorrida com os seguintes atributos e métodos. Todos os
atributos devem ser encapsulados. Criar uma classe Principal para testar os
métodos.
a. Atributos:- numeroCarro : int
- piloto : String
- equipe : String
- velocidadeMaxima : float
- velocidadeAtual : float
- ligado : boolean
b. Métodos:
+ set... (alterar atributos da Classe )
+ get... (retorna valores dos atributos da Classe )
+ acelerar(float) - aumenta unidades em Km/h
+ frear(float) - reduz a velocidade em percentual (%) de frenagem
+ parar()
+ ligar()
+ desligar()
c. Observações:
* Não ultrapassar a velocidade máxima
* Frear e Acelerar só funcionam se o carro estiver ligado
* Desligar só funciona se o carro estiver parado
---
3. Implemente as classes a seguir:
a. Crie uma classe chamada Ingresso que possui um valor em reais e um
método imprimeValor().
Crie uma classe VIP, que herda de Ingresso e possui um valor
adicional. Crie um método que retorne o valor do ingresso VIP (com o
adicional incluído).
Crie uma classe Normal, que herda de Ingresso e possui um método
que imprime: "Ingresso Normal".
Crie uma classe CamaroteInferior (que possui a localização do
ingresso e métodos para acessar e imprimir esta localização) e uma
classe CamaroteSuperior, que é mais cara (possui valor adicional).
Esta última possui um método para retornar o valor do ingresso.
Ambas as classes herdam a classe VIP.
Crie uma classe de Teste com o método main. Nesta classe crie um
ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP.
Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou
VIP. Se for VIP, peça para ele digitar 1 para camarote superior e 2 para
camarote inferior. Conforme a escolha do usuário, diga se que o VIP é
camarote superior ou inferior. Imprima o valor do ingresso.
