public class SAM {
    double p;
    double i;
    int n;
    double peso;
    double j;
    double pmt;

    public SAM(double p, double i, int n, double peso) {
        /*
         * "peso" é o peso do SAC em relação ao Price.
         */
        this.p = p;
        this.i = i;
        this.n = n;
        this.peso = peso;
        calcular();
    }

    public void calcular() {
        SAC sac = new SAC(this.p, this.i, this.n);
        Price price = new Price(this.p, this.i, this.n);
        this.j = sac.j * this.peso + price.j * (1 - this.peso);
        this.pmt = sac.getPMT() * this.peso + price.getPMT() * (1 - this.peso);
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
        SAM sam = new SAM(1200, 0.05, 12, 0.5);
        System.out.println("\n R$ " + sam.p + " (% " + (sam.i * 100) + ") = " + sam.pmt);

        sam.setPrincipal(1600);
        sam.setTaxa(0.25);
        sam.setParcelas(3);
        System.out.println("\n R$ " + sam.p + " (% " + (sam.i * 100) + ") = " + sam.pmt + "\n");
    }
}
