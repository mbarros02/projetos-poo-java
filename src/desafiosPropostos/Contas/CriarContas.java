package desafiosPropostos.Contas;

import java.util.ArrayList;
import java.util.List;

public class CriarContas {
    public static void main(String[] args) {
        ContaBancaria cp = new ContaPoupanca("Marcello", "1234");
        cp.adicionarNofificacao(new NotificacaoEmail());
        cp.adicionarNofificacao(new NotificarSms());

        cp.depositar(1000);
        cp.sacar(500);

        List<ContaBancaria> contaBancarias = new ArrayList<>();
        contaBancarias.add(0, cp);

        for (ContaBancaria conta : contaBancarias) {
            conta.aplicarRendimetoOuTarifa();
        }
        System.out.println(cp.toString());
    }
}