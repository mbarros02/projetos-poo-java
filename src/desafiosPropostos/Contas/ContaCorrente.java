package desafiosPropostos.Contas;

public class ContaCorrente extends ContaBancaria{

    private double taxa = 12.0;

    public ContaCorrente(String nomeTitular, String numConta) {
        super(nomeTitular, numConta);
    }

    @Override
    public void aplicarRendimetoOuTarifa() {
        setSaldoConta(getSaldoConta() - this.taxa);
        super.rendSucesso = true;
    }

    @Override
    public String toString() {
        return
                "----- Extrato de Conta -----" + '\n' +
                        "Conta Corrente" + '\n' +
                        super.toString() + '\n';
    }
}
