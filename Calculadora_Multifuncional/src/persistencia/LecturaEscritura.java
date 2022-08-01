package persistencia;

import java.awt.Desktop;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class LecturaEscritura {

    public static void EscribirHistorial() {

        BufferedWriter writer;

        try {
            FileWriter fw = new FileWriter("Historial.txt", true);
            writer = new BufferedWriter(fw);
            for (String s : milista) {
                writer.write(s + "\n");
            }
            writer.close();
            milista.clear();

        } catch (IOException e) {
        }
    }

    public static void anadirHistorial(List<String> milista1) {
        if (milista.isEmpty()) {
            Date d = java.util.Calendar.getInstance().getTime();
            milista.add("\n\t" + d.toString().toUpperCase() + "\n");
            milista.add("====================HISTORIAL CALCULADORA====================");
        }
        milista.addAll(milista1);
    }

    private static List<String> milista = new ArrayList<>();

    public static void abrirHistorial() {
        Desktop aEjecutar = Desktop.getDesktop();
        try {
            aEjecutar.open(new File("Historial.txt"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No existe el historial");
        }
    }

}
//
