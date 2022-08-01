package logica.ConversionUnidades;

public class Aceleracion {

    private double l;

    public Aceleracion(double l) {
        this.l = l;
    }

    public double pieMetroA() {
        l *= 0.3048;
        return l;
    }

    public double metroPieA() {
        l *= 3.28084;
        return l;
    }

}
