package logica.ConversionDivisas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public enum ConvDivisas {
        MXN_COP(173.73), USD_MXN(20.43), USD_EUR(0.83), EUR_GBP(0.86), GBP_CAD(1.77), CAD_CNY(5.12), CNY_COP(547.74), USD_COP(3553.10),
        EUR_COP(4305.80), GBP_COP(4980.27), CAD_COP(2816.45), EUR_MXN(24.76), GBP_MXN(28.64), CAD_MXN(16.20), CNY_MXN(3.16), GBP_USD(1.40), USD_CAD(1.26), USD_CNY(1.26),
        EUR_CAD(1.53), EUR_CNY(7.86), GBP_CNY(9.09), XPD_COP(57.09);

        private final double a;

        ConvDivisas(double a) {
            this.a = a;
        }


    public double Derecha(double valorEntrante) {
        double res;
        DecimalFormat df;
        df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        res = valorEntrante * a;
        res = Double.parseDouble(df.format(res));
        return res;
    }

    public double Invertida(double valorEntrante) {
        double res;
        DecimalFormat df;
        df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        res = valorEntrante / a;
        res = Double.parseDouble(df.format(res));
        return res;
    }

}
