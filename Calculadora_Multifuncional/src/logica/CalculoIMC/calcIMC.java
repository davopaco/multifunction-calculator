package logica.CalculoIMC;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class calcIMC {

    double p;
    double a;

    public calcIMC(double p, double a) {
        this.p = p;
        this.a = a;
    }

    public double calcularIMC() {
        DecimalFormat df;
        df = new DecimalFormat("#.0", new DecimalFormatSymbols(Locale.US));
        double res;
        if (p < 0) {
            p *= -1;
        }
        res = p / (Math.pow(a / 100, 2));
        res = Double.parseDouble(df.format(res));
        return res;
    }

}
