package desafiosPropostos.Contas;

public class NotificarSms implements Notificar {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("[SMS] - Enviando SMS para o cliente com a mensagem: " + mensagem);
    }
}
