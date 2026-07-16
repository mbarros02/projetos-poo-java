package consumindo_apis.desafiosModulo01.googleBooks;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGeckoApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String nomeMoeda, tipo;

        System.out.println("Digite o nome da moeda que deseja pesquisar:");
        nomeMoeda = scan.nextLine();
        System.out.println("Digite o tipo da moeda:");
        tipo = scan.nextLine();

        String chaveApi = "CG-Von4oj3PcnWFYwtmFpv2VMic";
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + nomeMoeda +
                "&vs_currencies=" + tipo + "&x-cg-demo-api-key=" + chaveApi;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
