public class Main {
    public static void main(String[]args){
        Cliente cli = new Cliente();
        cli.setNome("Miguel");
        Conta cc = new ContaCorrente(cli);
        Conta cp = new ContaPoupanca(cli);

        cc.depositar(100);
        cc.sacar(50);
        cc.depositar(300);
        cc.transferir(50, cp);


        cc.imprimirExtrato();
        cc.imprimirExtratoTransacoes();


        cp.imprimirExtrato();
    }
}