public class SAC {
    double p;
    double i;
    int n;
    double j;
    double pmt;

    public SAC(double p, double i, int n) {
        this.p = p;
        this.i = i;
        this.n = n;
        calcular();
    }

    public void calcular() {
        this.j = this.p * this.i;
        this.pmt = this.p / this.n + this.j;
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
        SAC sac = new SAC(1200, 0.05, 12);
        System.out.println("\n R$ " + sac.p + " (% " + (sac.i * 100) + ") = " + sac.pmt);

        sac.setPrincipal(1600);
        sac.setTaxa(0.25);
        sac.setParcelas(3);
        System.out.println("\n R$ " + sac.p + " (% " + (sac.i * 100) + ") = " + sac.pmt + "\n");
    }
}
