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
        if (number < 1 || number > 3) {
            return null; 
        }
        
        StringBuilder roman = new StringBuilder();
        int temp = number;
        while (temp >= 1) {
            roman.append("I");
            temp--;
        }
        return roman.toString();
    }
}