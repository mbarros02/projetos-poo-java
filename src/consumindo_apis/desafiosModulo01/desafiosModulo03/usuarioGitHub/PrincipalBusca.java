package consumindo_apis.desafiosModulo01.desafiosModulo03.usuarioGitHub;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String nome, endereco;

        System.out.println("Digite o userame para a pesquisa: ");
        nome = scan.nextLine();
        endereco = "https://api.github.com/users/" + nome;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Erro: Usuário não encontrado.");
            } else if (response.statusCode() == 200) {
                System.out.println(response.body());
                System.out.println("Busca realizada com sucesso!");
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
