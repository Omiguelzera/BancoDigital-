public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("*** Extrato conta poupança ***");
        super.imprimirInfos();
    }

    public void imprimirExtratoTransacoes(){
        System.out.println("=== Extrato de transações Conta Poupança ====");
        super.imprimirExtratoTransacoes();
    }
}
