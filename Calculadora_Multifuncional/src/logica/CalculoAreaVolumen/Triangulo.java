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
public class Triangulo extends Figura {

    double lado1;
    double lado2;
    double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Triangulo(double lado1) {
        this.lado1 = lado1;
    }

    @Override
    public double area() {
        double res;
        DecimalFormat df;
        df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        res = (lado1 * lado2) / 2;
        res = Double.parseDouble(df.format(res));
        return res;
    }

    @Override
    public double perimetro() {
        double res;
        if (lado3 == 0 && lado2 == 0) {
            DecimalFormat df;
            df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
            res = lado1 * 3;
            res = Double.parseDouble(df.format(res));
        } else if (lado3 == 0) {
            DecimalFormat df;
            df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
            res = lado1 + 2 * lado2;
            res = Double.parseDouble(df.format(res));
        } else {
            DecimalFormat df;
            df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
            res = lado1 + lado2 + lado3;
            res = Double.parseDouble(df.format(res));
        }
        return res;
    }
}
