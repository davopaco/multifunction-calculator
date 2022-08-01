package logica.NumerosRomanos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumRomanos {

    private final static TreeMap<Integer, String> entero = new TreeMap<Integer, String>();

    static {

        entero.put(1000, "M");
        entero.put(900, "CM");
        entero.put(500, "D");
        entero.put(400, "CD");
        entero.put(100, "C");
        entero.put(90, "XC");
        entero.put(50, "L");
        entero.put(40, "XL");
        entero.put(10, "X");
        entero.put(9, "IX");
        entero.put(5, "V");
        entero.put(4, "IV");
        entero.put(1, "I");

    }

    private static Map<Character, Integer> getRomano() {
        Map<Character, Integer> romano = new HashMap<>();
        romano.put('I', 1);
        romano.put('V', 5);
        romano.put('X', 10);
        romano.put('L', 50);
        romano.put('C', 100);
        romano.put('D', 500);
        romano.put('M', 1000);
        return romano;
    }

    public final static String toRomano(int n) {
        int l = entero.floorKey(n);
        if (n == l) {
            return entero.get(n);
        }
        return entero.get(l) + toRomano(n - l);
    }

    public static int toEntero(String e) {

        int resp = 0;
        Map<Character, Integer> romano1 = getRomano();

        for (int i = 0; i < e.length() - 1; i++) {
            int valor = romano1.get(e.charAt(i));

            if (valor < romano1.get(e.charAt(i + 1))) {
                resp -= valor;
            } else {
                resp += valor;
            }

        }
        resp += romano1.get(e.charAt(e.length() - 1));
        return resp;

    }
}
