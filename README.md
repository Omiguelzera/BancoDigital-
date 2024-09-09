
# Documentação da Implementação de Conta Bancária com Histórico de Transações e Limite de Saque
## Visão Geral
O sistema implementado visa simular o funcionamento de contas bancárias (Conta Corrente e Conta Poupança) com as seguintes funcionalidades:

Depósito, Saque e Transferência de valores entre contas.
Consulta de limite de saque e a possibilidade de definir um novo limite.
Registro de histórico de transações realizado na conta.
Impressão de extrato e do histórico de transações.
A implementação está dividida em várias classes e interfaces que seguem os princípios de Programação Orientada a Objetos (POO).

Estrutura de Classes e Interface
Interface IConta: A interface define os métodos que todas as classes de contas devem implementar:

- sacar(double valor)
- depositar(double valor)
- transferir(double valor, Conta contaDestino)
- imprimirExtratoTransacoes()
- consultarLimiteSaque()
- definirLimiteSaque(double novoLimite)
----------------------------------------------
* Classe Abstrata Conta: Esta classe abstrata implementa a interface IConta e contém a lógica comum para todas as contas, como os métodos de saque, depósito, transferência, e consulta de saldo e limites. Ela também armazena o histórico de transações em uma lista e possui o método para imprimir o extrato da conta.

* Classes Filhas ContaCorrente e ContaPoupanca: Essas classes estendem a classe abstrata Conta e podem ter comportamentos específicos dependendo da conta (por exemplo, cobrança de taxas, rendimentos, etc.).

Funcionalidades Implementadas
Depósito (depositar)

1. Permite depositar valores em uma conta.
Registra a transação no histórico.
Saque (sacar)

2. Realiza um saque se o valor não exceder o saldo disponível e o limite de saque.
Adiciona o saque ao histórico de transações.
Transferência (transferir)

3. Transfere um valor de uma conta para outra, descontando o valor da conta de origem e creditando-o na conta de destino.
Adiciona a transferência ao histórico.
Histórico de Transações (historicoTransacao)

4. Cada operação de saque, depósito e transferência é registrada no histórico da conta, que pode ser impresso posteriormente.
Limite de Saque

5. Consultar Limite de Saque: O método consultarLimiteSaque retorna o valor do limite de saque atual da conta.
6. Definir Limite de Saque: O método definirLimiteSaque permite que um novo limite de saque seja definido, desde que seja positivo.
Impressão de Extrato (imprimirInfos e imprimirExtratoTransacoes)

O método imprimirInfos imprime as principais informações da conta, como titular, agência, número da conta e saldo.
O método imprimirExtratoTransacoes imprime o histórico de transações realizadas na conta.

## Pilares da Programação Orientada a Objetos (POO)
- Encapsulamento: As variáveis e métodos estão devidamente encapsulados dentro das classes, sendo acessíveis apenas por meio de getters, setters e métodos específicos.

- Herança: A classe Conta é uma classe abstrata, e as classes ContaCorrente e ContaPoupanca herdam seus comportamentos, permitindo a reutilização de código e a especialização para cada tipo de conta.

- Polimorfismo: A interface IConta permite que diferentes tipos de conta (poupança e corrente) possam ser tratados de maneira uniforme, sem se preocupar com a implementação específica de cada uma.

- Abstração: A classe Conta é abstrata, definindo o comportamento genérico de uma conta bancária. Isso permite que as subclasses possam implementar detalhes específicos conforme necessário.

## Conclusão
Esta implementação simula um sistema de contas bancárias com funcionalidades básicas como saque, depósito, transferência e limite de saque, seguindo os pilares da Programação Orientada a Objetos (POO). A inclusão de um histórico de transações permite o acompanhamento detalhado das movimentações realizadas em cada conta.







