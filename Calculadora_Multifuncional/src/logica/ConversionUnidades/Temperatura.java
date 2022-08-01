package logica.ConversionUnidades;

public class Temperatura {

    private double l;

    public Temperatura(double l) {
        this.l = l;
    }

    public double celciusFahr() {
        l = (l * 9 / 5) + 32;
        return l;
    }

    public double fahrCelcius() {
        l = (l - 32) * 5 / 9;
        return l;
    }

    public double kelvinCelcius() {
        l = l - 273.15;
        return l;
    }

    public double celciusKelvin() {
        l = l + 273.15;
        return l;
    }

}
