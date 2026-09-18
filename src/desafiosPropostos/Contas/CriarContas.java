package desafiosPropostos.Contas;

import java.util.ArrayList;
import java.util.List;

public class CriarContas {
    public static void main(String[] args) {
        ContaBancaria cp = new ContaPoupanca("Marcello", "1234");

        cp.setSaldoConta(1000);
        cp.sacar(500);
        cp.depositar(500);

        List<ContaBancaria> contaBancarias = new ArrayList<>();
        contaBancarias.add(0, cp);

        for (ContaBancaria conta : contaBancarias) {
            conta.aplicarRendimetoOuTarifa();
            conta.adicionarNofificacao(new NotificacaoEmail());
            conta.adicionarNofificacao(new NotificarSms());
        }
        System.out.println(cp.toString());
    }
}