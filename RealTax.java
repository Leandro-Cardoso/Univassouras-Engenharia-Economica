public class RealTax {
    double taxaAparente;
    double inflacao;
    double taxaReal;

    public RealTax(double taxaAparente, double inflacao) {
        this.taxaAparente = taxaAparente;
        this.inflacao = inflacao;
        this.calcular();
    }

    public void calcular() {
        this.taxaReal = ((1 + this.taxaAparente / 100) / (1 + this.inflacao / 100) - 1) * 100;
    }

    public double getTaxaReal() {
        return this.taxaReal;
    }

    public void setTaxaAparente(double taxaAparente) {
        this.taxaAparente = taxaAparente;
        this.calcular();
    }

    public void setInflacao(double inflacao) {
        this.inflacao = inflacao;
        this.calcular();
    }

    public static void main(String[] args) {
        RealTax taxa = new RealTax(6, 5);
        System.out.println("\n Taxa real: " + taxa.getTaxaReal() + " %\n");
    }
}