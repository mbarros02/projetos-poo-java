package desafiosPropostos.Contas;

public class NotificacaoEmail implements  Notificar {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("[EMAIL] - Enviando e-mail para cliente com a mensagem: " + mensagem);
    }
}
