package logica.ConversionUnidades;

public class Presion {

    private double l;

    public Presion(double l) {
        this.l = l;
    }

    public double pascalPoundal() {
        l *= 0.672;
        return l;
    }

    public double poundalPascal() {
        l *= 1.4882;
        return l;
    }

}
