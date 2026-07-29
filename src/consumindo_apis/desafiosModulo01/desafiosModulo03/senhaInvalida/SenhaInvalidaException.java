package consumindo_apis.desafiosModulo01.desafiosModulo03.senhaInvalida;

public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
