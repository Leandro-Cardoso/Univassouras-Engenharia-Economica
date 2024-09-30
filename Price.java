public class Price {
    double p;
    double i;
    int n;
    double j;
    double pmt;

    public Price(double p, double i, int n) {
        this.p = p;
        this.i = i;
        this.n = n;
        calcular();
    }

    public void calcular() {
        this.j = this.p / this.n * this.i;
        this.pmt = this.p * this.i * Math.pow(1 + this.i, this.n) / (Math.pow(1 + this.i, this.n) - 1);
    }

    public void setPrincipal(double p) {
        this.p = p;
        calcular();
    }

    public void setTaxa(double i) {
        this.i = i;
        calcular();
    }

    public void setParcelas(int n) {
        this.n = n;
        calcular();
    }

    public double getJuros() {
        return this.j;
    }

    public double getPMT() {
        return this.pmt;
    }

    public static void main(String[] args) {
        Price price = new Price(1200, 0.05, 12);
        System.out.println("\n R$ " + price.p + " (% " + (price.i * 100) + ") = " + price.pmt);

        price.setPrincipal(1600);
        price.setTaxa(0.25);
        price.setParcelas(3);
        System.out.println("\n R$ " + price.p + " (% " + (price.i * 100) + ") = " + price.pmt + "\n");
    }
}
