package logica.CalculoDescuento;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class calcDesc {

    double p;
    double d;

    public calcDesc(double p, double d) {
        this.p = p;
        this.d = d;
    }

    public double calcularDescuento() {
        double res;
        DecimalFormat df;
        df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        res = p - p * (d / 100);
        res = Double.parseDouble(df.format(res));
        return res;

    }
}
