/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.CalculoAreaVolumen;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author Infinity Tech SAS
 */
public class Cono extends Figura3D {

    double radio;
    double altura;

    public Cono(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double volumen() {
        double res;
        DecimalFormat df;
        df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        res = (Math.PI * Math.pow(radio, 2) * altura) / 3;
        res = Double.parseDouble(df.format(res));
        return res;
    }

}
