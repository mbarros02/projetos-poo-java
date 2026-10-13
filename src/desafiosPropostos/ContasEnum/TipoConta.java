package desafiosPropostos.ContasEnum;

public enum TipoConta {
    CORRENTE(12.0) {
        @Override
        public double calcular(double saldoAtual) {
        return -getTaxaOuRendimento();
        }
    },

    POUPANCA(0.005) {
        @Override
        public double calcular(double saldoAtual) {
            saldoAtual = saldoAtual * getTaxaOuRendimento();
        return saldoAtual;
        }
    };

    private final double taxaOuRendimento;

    TipoConta(double taxaOuRendimento) {
        this.taxaOuRendimento = taxaOuRendimento;
    }

    public double getTaxaOuRendimento() {
        return taxaOuRendimento;
    }

    public abstract double calcular(double saldoAtual);


}
