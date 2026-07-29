package consumindo_apis.desafiosModulo01.desafiosModulo03;

public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
