public class JurosCompostos {
    double c;
    double i;
    int t;
    double j;
    double m;

    public JurosCompostos(double c, double i, int t) {
        this.c = c;
        this.i = i;
        this.t = t;
        calcular();
    }

    public void calcular() {
        this.m = this.c * Math.pow(1 + this.i, this.t);
        this.j = this.m - this.c;
    }

    public void setCapital(double c) {
        this.c = c;
        calcular();
    }

    public void setTaxa(double i) {
        this.i = i;
        calcular();
    }

    public void setTempo(int t) {
        this.t = t;
        calcular();
    }

    public double getJuros() {
        return this.j;
    }

    public double getMontante() {
        return this.m;
    }

    public static void main(String[] args) {
        JurosCompostos jurosCompostos = new JurosCompostos(1200, 0.05, 12);
        System.out.println("\n R$ " + jurosCompostos.c + " x (1 + " + jurosCompostos.i + ")^" + jurosCompostos.t + " = " + jurosCompostos.j);
        System.out.println(" R$ " + jurosCompostos.c + " + " + jurosCompostos.j + " = " + jurosCompostos.m);

        jurosCompostos.setCapital(1600);
        jurosCompostos.setTaxa(0.25);
        jurosCompostos.setTempo(3);
        System.out.println("\n R$ " + jurosCompostos.c + " x (1 + " + jurosCompostos.i + ")^" + jurosCompostos.t + " = " + jurosCompostos.j);
        System.out.println(" R$ " + jurosCompostos.c + " + " + jurosCompostos.j + " = " + jurosCompostos.m + "\n");
    }
}
