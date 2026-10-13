package desafiosPropostos.ContasEnum;

import desafiosPropostos.ContasComSubclasses.clientes.Cliente;
import desafiosPropostos.ContasComSubclasses.enderecos.Endereco;

public class CriarContaEnum {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("04943040", "São Paulo", "Rua tal");
        Cliente cliente = new Cliente("Marcello", "44766884892", endereco);
        Conta conta = new Conta(cliente,"1234", TipoConta.CORRENTE);
        Conta contaDois = new Conta(cliente,"1234", TipoConta.POUPANCA);
        conta.depositar(1000);
        contaDois.depositar(990);
        conta.aplicarRendimentoOuTarifa();
        contaDois.aplicarRendimentoOuTarifa();

        System.out.println(conta.toString());
        System.out.println();
        System.out.println(contaDois.toString());
    }
}
