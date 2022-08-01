package logica.ConversionUnidades;

public class Velocidad {

    private double l;

    public Velocidad(double l) {
        this.l = l;
    }

    public double pieMetroS() {
        l *= 0.3048;
        return l;
    }

    public double metroPieS() {
        l *= 3.28084;
        return l;
    }

}
