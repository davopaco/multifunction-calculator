package logica.ConversionUnidades;

public class Fuerza {

    private double l;

    public Fuerza(double l) {
        this.l = l;
    }

    public double poundalNewton() {
        l *= 0.138255;
        return l;
    }

    public double newtonPoundal() {
        l *= 7.23301;
        return l;
    }

}
