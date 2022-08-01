package logica.CalculoEdad;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class CalEdad {

    private int a, c, d, f;
    private String b, e;

    public CalEdad(int a, String b, int c, int d, String e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public Map<String, Integer> getMes() {
        Map<String, Integer> m = new HashMap<>();
        m.put("Enero", 1);
        m.put("Febrero", 2);
        m.put("Marzo", 3);
        m.put("Abril", 4);
        m.put("Mayo", 5);
        m.put("Junio", 6);
        m.put("Julio", 7);
        m.put("Agosto", 8);
        m.put("Septiembre", 9);
        m.put("Octubre", 10);
        m.put("Noviembre", 11);
        m.put("Diciembre", 12);

        return m;
    }

    public Period calcularPeriodo() {
        Period edad;
        try{
        edad = Period.between(LocalDate.of(a, getMes().get(b), c), LocalDate.of(d, getMes().get(e), f));
        }catch(DateTimeException l){
            edad=null;
        }
        return edad;
    }
    
    public int getDias() {
        return calcularPeriodo().getDays();
    }

    public int getMeses() {
        return calcularPeriodo().getMonths();
    }

    public int getAnhos() {
        return calcularPeriodo().getYears();
    }

    public int getMes1() {
        return getMes().get(b);
    }

    public int getMes2() {
        return getMes().get(e);
    }

}
