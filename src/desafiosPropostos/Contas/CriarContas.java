package desafiosPropostos.Contas;

import java.util.ArrayList;
import java.util.List;

public class CriarContas {
    public static void main(String[] args) {
        ContaBancaria cp = new ContaPoupanca("Marcello", "1234");
        ContaBancaria cc = new ContaCorrente("Marcello", "3214");

        cc.depositar(50);
        System.out.println(cc.toString());
        cp.depositar(50);
        System.out.println(cp.toString());

        List<ContaBancaria> contaBancarias = new ArrayList<>();
        contaBancarias.add(0, cc);
        contaBancarias.add(1, cp);

        for (ContaBancaria conta : contaBancarias) {
            conta.aplicarRendimetoOuTarifa();
        }

        System.out.println(cc.toString());
        System.out.println(cp.toString());
    }
}