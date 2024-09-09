import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private List<String> historicoTransacao;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

        public Conta(Cliente cliente){
            this.agencia = Conta.AGENCIA_PADRAO;
            this.numero = SEQUENCIAL++;
            this.cliente = cliente;
            this.historicoTransacao = new ArrayList<>();
        }

    @Override
    public void sacar(double valor) {
        if(valor > saldo || saldo <= 0 ) throw new Error("Impossivel efetuar o saque");
        saldo -= valor;
        historicoTransacao.add(String.format("Saque: %.2f", valor));
    }

    @Override
    public void depositar(double valor) {
        if(valor <= 0 ) throw new Error("Valor tem q ser maior q zero");
        saldo += valor;
        historicoTransacao.add(String.format("Saque: %.2f", valor));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        historicoTransacao.add(String.format("Saque: %.2f", valor));
    }


    protected void imprimirInfos(){
            System.out.printf("Titular: %s", this.cliente.getNome());
            System.out.printf("Agencia: %d", this.agencia);
            System.out.printf("numero: %d", this.numero);
            System.out.printf("Saldo: %.2f", this.saldo);
            System.out.println("Histórico de Transações:");
    }

    @Override
    public void imprimirExtratoTransacoes() {
        for(String transacao : historicoTransacao){
            System.out.println(transacao);
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
