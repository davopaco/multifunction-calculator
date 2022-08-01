package logica.ConversionUnidades;

public class Masa {

    private double l;

    public Masa(double l) {
        this.l = l;
    }

    public double libraKilo() {
        l *= 0.453592;
        return l;
    }

    public double kiloLibra() {
        l *= 2.20462;
        return l;
    }

}
