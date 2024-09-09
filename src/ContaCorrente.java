public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("*** Extrato conta corrente ***");
        super.imprimirInfos();
    }

    public void imprimirExtratoTransacoes(){
        System.out.println("=== Extrato de transações Conta Corrente ===");
        super.imprimirExtratoTransacoes();
    }
}
