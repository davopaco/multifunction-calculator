package logica.ConversionUnidades;

public class Tiempo {

    private double l;

    public Tiempo(double l) {
        this.l = l;
    }

    public double segMin() {
        l *= 0.0166667;
        return l;
    }

    public double minSeg() {
        l *= 60;
        return l;
    }

}
