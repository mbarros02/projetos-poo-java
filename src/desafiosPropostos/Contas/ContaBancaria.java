package desafiosPropostos.Contas;

public abstract class ContaBancaria {
    public ContaBancaria(String nomeTitular, String numConta) {
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldoConta = 0;
    }

    private String nomeTitular;
    private String numConta;
    private double saldoConta;

    public String getNomeTitular() {
        return nomeTitular;
    }

    private void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumConta() {
        return numConta;
    }

    private void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    protected void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Depósito não permitido!!");
            System.out.println("Não permitido depositar valor negativo!!!");
        } else {
            this.saldoConta += valorDeposito;
        }
    }

    public void sacar(double valorSaque) {
        if(valorSaque <= 0 || valorSaque > this.saldoConta) {
            System.out.println("Não foi possível realizar o saque!!");
            System.out.println("Saldo insufuciente!");
        } else {
            this.saldoConta += valorSaque;
        }
    }

    public abstract void aplicarRendimetoOuTarifa();

    @Override
    public String toString() {
        return "Nome do Titular: " + nomeTitular + '\n' +
                "Número da Conta: " + numConta + '\n' +
                "Saldo da Conta: R$ " + String.format("%.2f", saldoConta);
    }
}

