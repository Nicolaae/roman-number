////////////////////////////////////////////////////////////////////
// Nicola Gava 2148613
// Julvi Myrtaj 2148612
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    private RomanPrinter() {
        throw new IllegalStateException("Utility class");
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null) {
            return "";
        }

        String[] result = {"", "", "", "", "", ""};
        
        for (int i = 0; i < romanNumber.length(); i++) {
            char c = romanNumber.charAt(i);
            if (c == 'I') {
                result[0] += "  _____  ";
                result[1] += " |_   _| ";
                result[2] += "   | |   ";
                result[3] += "   | |   ";
                result[4] += "  _| |_  ";
                result[5] += " |_____| ";
            } else if (c == 'V') {
                result[0] += " __      __ ";
                result[1] += " \\ \\    / / ";
                result[2] += "  \\ \\  / /  ";
                result[3] += "   \\ \\/ /   ";
                result[4] += "    \\  /    ";
                result[5] += "     \\/     ";
            } else if (c == 'X') {
                result[0] += " __   __ ";
                result[1] += " \\ \\ / / ";
                result[2] += "  \\ V /  ";
                result[3] += "   > <   ";
                result[4] += "  / . \\  ";
                result[5] += " /_/ \\_\\ ";
            } else if (c == 'L') {
                result[0] += "  _       ";
                result[1] += " | |      ";
                result[2] += " | |      ";
                result[3] += " | |      ";
                result[4] += " | |____  ";
                result[5] += " |______| ";
            } else if (c == 'C') {
                result[0] += "   _____  ";
                result[1] += "  / ____| ";
                result[2] += " | |      ";
                result[3] += " | |      ";
                result[4] += " | |____  ";
                result[5] += "  \\_____| ";
            } else if (c == 'D') {
                result[0] += "  _____   ";
                result[1] += " |  __ \\  ";
                result[2] += " | |  | | ";
                result[3] += " | |  | | ";
                result[4] += " | |__| | ";
                result[5] += " |_____/  ";
            } else if (c == 'M') {
                result[0] += "  __  __  ";
                result[1] += " |  \\/  | ";
                result[2] += " | \\  / | ";
                result[3] += " | |\\/| | ";
                result[4] += " | |  | | ";
                result[5] += " |_|  |_| ";
            }
        }
        
        return String.join("\n", result) + "\n";
    }
}