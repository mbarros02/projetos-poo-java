package desafiosPropostos.Contas;

public class ContaPoupanca extends ContaBancaria {

    private double rendimento;

    public ContaPoupanca(Cliente cliente, String numConta) {
        super(cliente, numConta);
    }

    @Override
    public void aplicarRendimetoOuTarifa() {
        this.rendimento = getSaldoConta() * 0.005;
        setSaldoConta(getSaldoConta() + this.rendimento);
        notificarTodos("Rendimento aplicado no valor de: " + this.rendimento);
    }

    @Override
    public String toString() {
        return  '\n' +
                "----- Extrato de Conta -----" + '\n' +
                        "Conta Poupança" + '\n' +
                        super.toString() + '\n';
    }
}
