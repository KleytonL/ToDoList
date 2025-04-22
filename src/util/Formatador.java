package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatador {

    public static String formatDate(LocalDate data) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatador);
    }

}
