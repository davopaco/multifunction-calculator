package logica.ConversionUnidades;

public class Area {

    private double l;

    public Area(double l) {
        this.l = l;
    }

    public double pieMetroC() {
        l *= 0.092903;
        return l;
    }

    public double metroPieC() {
        l *= 10.7639;
        return l;
    }

}
