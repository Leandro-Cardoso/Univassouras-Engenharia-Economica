public class JurosSimples {
    double c;
    double i;
    int t;
    double j;
    double m;

    public JurosSimples(double c, double i, int t) {
        this.c = c;
        this.i = i;
        this.t = t;
        calcular();
    }

    public void calcular() {
        this.j = c * i * t;
        this.m = c + j;
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
        JurosSimples jurosSimples = new JurosSimples(3000, 0.1, 6);
        System.out.println("\n R$ " + jurosSimples.c + " x " + jurosSimples.i + " x " + jurosSimples.t + " = " + jurosSimples.j);
        System.out.println(" R$ " + jurosSimples.c + " + " + jurosSimples.j + " = " + jurosSimples.m);

        jurosSimples.setCapital(90000);
        jurosSimples.setTaxa(0.08 / 30);
        jurosSimples.setTempo(530);
        System.out.println("\n R$ " + jurosSimples.c + " x " + jurosSimples.i + " x " + jurosSimples.t + " = " + jurosSimples.j);
        System.out.println(" R$ " + jurosSimples.c + " + " + jurosSimples.j + " = " + jurosSimples.m + "\n");
    }
}