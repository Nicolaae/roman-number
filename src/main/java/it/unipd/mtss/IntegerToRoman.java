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
        if (number < 1 || number > 50) {
            return null; 
        }

        StringBuilder roman = new StringBuilder();
        int temp = number;

        if (temp == 50) {
            roman.append("L");
            temp -= 50;
        } else if (temp >= 40) {
            roman.append("XL");
            temp -= 40;
        }

        while (temp >= 10) {
            roman.append("X");
            temp -= 10;
        }
        
        if (temp == 9) {
            roman.append("IX");
            temp -= 9;
        }

        if (temp >= 5) {
            roman.append("V");
            temp -= 5;
        } else if (temp == 4) {
            roman.append("IV");
            temp -= 4;
        }

        while (temp >= 1) {
            roman.append("I");
            temp--;
        }
        
        return roman.toString();
    }
}