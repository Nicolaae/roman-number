////////////////////////////////////////////////////////////////////
// Nicola Gava 2148613
// Julvi Myrtaj 2148612
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    private IntegerToRoman() {
        throw new IllegalStateException("Utility class");
    }

    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            return null; 
        }

        // Struttura dati: mappa i valori in ordine decrescente
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        int temp = number;

        // Logica semplificata: scorre l'array senza bisogno di if/else multipli
        for (int i = 0; i < values.length; i++) {
            while (temp >= values[i]) {
                roman.append(symbols[i]);
                temp -= values[i];
            }
        }
        
        return roman.toString();
    }
}