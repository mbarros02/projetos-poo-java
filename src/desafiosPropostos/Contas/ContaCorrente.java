package desafiosPropostos.Contas;

public class ContaCorrente extends ContaBancaria{

    private double taxa = 12.0;

    public ContaCorrente(String nomeTitular, String numConta) {
        super(nomeTitular, numConta);
    }

    @Override
    public void aplicarRendimetoOuTarifa() {
        setSaldoConta(getSaldoConta() - this.taxa);
        notificarTodos("Tarifa aplicado no valor de: " + taxa);
    }

    @Override
    public String toString() {
        return  '\n' +
                "----- Extrato de Conta -----" + '\n' +
                        "Conta Corrente" + '\n' +
                        super.toString() + '\n';
    }
}
