package desafiosPropostos.Contas;

public class Endereco {

    private String rua;
    private String cidade;
    private String cep;

    public Endereco(String cep, String cidade, String rua) {
        this.cep = cep;
        this.cidade = cidade;
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String toString() {
        return  "CEP: " + cep + '\n' +
                "Rua: " + rua + '\n' +
                "Cidade: " + cidade;
    }
}
