package consumindo_apis.desafiosModulo01.desafiosModulo03;

import java.util.Scanner;

public class DivisaoPorZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite dois números para calcularmos a divisão entre eles.");
        System.out.println("Nenhum dos dois números pode ser zero.");

        System.out.println("Informe o numerador: ");
        num1 = scan.nextInt();
        System.out.println("Informe o denominador: ");
        num2 = scan.nextInt();

        try {
                int calculo = num1 / num2;
                System.out.println("O resultado da divisão é: " + calculo);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        }
    }
}
