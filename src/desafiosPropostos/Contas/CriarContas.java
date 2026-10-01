package desafiosPropostos.Contas;

import java.util.ArrayList;
import java.util.List;

public class CriarContas {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("04943040", "Sao paulo", "rua");
        Cliente c1 = new Cliente("Marcello", "44766884892",endereco);
        ContaBancaria cp = new ContaPoupanca(c1, "1234");
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