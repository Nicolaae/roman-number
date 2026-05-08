////////////////////////////////////////////////////////////////////
// Nicola Gava 2148613
// Julvi Myrtaj 2148612
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    // Costruttore privato per nascondere quello pubblico di default
    private RomanPrinter() {
        throw new IllegalStateException("Utility class");
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        // Ritorno fittizio temporaneo per permettere la compilazione
        return "";
    }
}