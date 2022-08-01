package logica.ConversionUnidades;

public class Trabajo {

    private double l;

    public Trabajo(double l) {
        this.l = l;
    }

    public double joulePoundal() {
        l *= 23.7303;
        return l;
    }

    public double poundalJoule() {
        l *= 0.042140;
        return l;
    }

}
