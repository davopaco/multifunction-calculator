package logica.ConversionUnidades;

public class Longitud {

    private double l;

    public Longitud(double l) {
        this.l = l;
    }

    public double pulgadaMetro() {
        l *= 0.0254;
        return l;
    }

    public double metroPulgada() {
        l *= 39.3701;
        return l;
    }

    public double metroPie() {
        l *= 1.09361;
        return l;
    }

    public double pieMetro() {
        l *= 0.3048;
        return l;
    }

}
