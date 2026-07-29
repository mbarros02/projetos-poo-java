package consumindo_apis.desafiosModulo01.desafiosModulo03.senhaInvalida;

import java.util.Scanner;

public class SenhaInvalida {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String senha;

        System.out.println("Digite sua senha: ");
        senha = scan.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if(senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve conter mais que 8 caracteres");
        }
    }
}
