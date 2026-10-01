package desafiosPropostos.Contas;

import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria {

    private Cliente cliente;
    private String numConta;
    private double saldoConta;
    private List<Notificar> canaisNotificacoes;

    public ContaBancaria(Cliente cliente, String numConta) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldoConta = 0;
        this.canaisNotificacoes = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
            notificarTodos("Depósito no valor de: " +  valorDeposito);
        }
    }

    public void sacar(double valorSaque) {
        if(valorSaque <= 0 || valorSaque > this.saldoConta) {
            System.out.println("Não foi possível realizar o saque!!");
            System.out.println("Saldo insufuciente!");
        } else {
            this.saldoConta -= valorSaque;
            notificarTodos("Saque realizado no valor de: " +  valorSaque);
        }
    }

    public void adicionarNofificacao(Notificar canal) {
        canaisNotificacoes.add(canal);
    }

    protected void notificarTodos(String mensagem) {
        for(Notificar canal : canaisNotificacoes) {
            canal.enviarNotificacao(mensagem);
        }
    }

    public abstract void aplicarRendimetoOuTarifa();

    @Override
    public String toString() {
        return  "" + cliente + '\n' +
                "Número da Conta: " + numConta + '\n' +
                "Saldo da Conta: R$ " + String.format("%.2f", saldoConta);
    }
}

