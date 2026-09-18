package desafiosPropostos.Contas;

public class ContaPoupanca extends ContaBancaria {

    private double rendimento;

    public ContaPoupanca(String nomeTitular, String numConta) {
        super(nomeTitular, numConta);
    }

    @Override
    public void aplicarRendimetoOuTarifa() {
        this.rendimento = getSaldoConta() * 0.005;
        setSaldoConta(getSaldoConta() + this.rendimento);
    }

    @Override
    public String toString() {
        return
                "----- Extrato de Conta -----" + '\n' +
                        "Conta Poupança" + '\n' +
                        super.toString() + '\n';
    }
}
