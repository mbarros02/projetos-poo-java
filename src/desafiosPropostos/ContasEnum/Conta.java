package desafiosPropostos.ContasEnum;

import desafiosPropostos.ContasComSubclasses.clientes.Cliente;

public class Conta {

    private Cliente cliente;
    private TipoConta tipoConta;
    private String numConta;
    private double saldo;

    public Conta(Cliente cliente, String numConta, TipoConta tipoConta) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.tipoConta = tipoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void aplicarRendimentoOuTarifa(){
        saldo += tipoConta.calcular(saldo);
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Depósito não permitido!!");
            System.out.println("Não permitido depositar valor negativo!!!");
        } else {
            this.saldo += valorDeposito;
        }
    }

    @Override
    public String toString() {
        return "Conta" + "\n" +
                cliente + "\n" +
                "NumConta: " + numConta + "\n" +
                "TipoConta: " + tipoConta + "\n" +
                "Saldo: R$ " + String.format("%.2f", saldo);
    }
}
