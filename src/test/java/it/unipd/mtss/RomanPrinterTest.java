////////////////////////////////////////////////////////////////////
// Nicola Gava 2148613
// Julvi Myrtaj 2148612
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint_One_ReturnsAsciiI() {
        String expected = 
            "  _____  \n" +
            " |_   _| \n" +
            "   | |   \n" +
            "   | |   \n" +
            "  _| |_  \n" +
            " |_____| \n";
        
        assertEquals(expected, RomanPrinter.print(1));
    }

    @Test
    public void testPrint_Four_ReturnsAsciiIV() {
        String expected = 
            "  _____   __      __ \n" +
            " |_   _|  \\ \\    / / \n" +
            "   | |     \\ \\  / /  \n" +
            "   | |      \\ \\/ /   \n" +
            "  _| |_      \\  /    \n" +
            " |_____|      \\/     \n";
        
        assertEquals(expected, RomanPrinter.print(4));
    }

    @Test
    public void testPrint_Nine_ReturnsAsciiIX() {
        String expected = 
            "  _____   __   __ \n" +
            " |_   _|  \\ \\ / / \n" +
            "   | |     \\ V /  \n" +
            "   | |      > <   \n" +
            "  _| |_    / . \\  \n" +
            " |_____|  /_/ \\_\\ \n";
        
        assertEquals(expected, RomanPrinter.print(9));
    }

    @Test
    public void testPrint_Fourteen_ReturnsAsciiXIV() {
        String expected = 
            " __   __   _____   __      __ \n" +
            " \\ \\ / /  |_   _|  \\ \\    / / \n" +
            "  \\ V /     | |     \\ \\  / /  \n" +
            "   > <      | |      \\ \\/ /   \n" +
            "  / . \\    _| |_      \\  /    \n" +
            " /_/ \\_\\  |_____|      \\/     \n";
        
        assertEquals(expected, RomanPrinter.print(14));
    }

    @Test
    public void testPrint_Nineteen_ReturnsAsciiXIX() {
        String expected = 
            " __   __   _____   __   __ \n" +
            " \\ \\ / /  |_   _|  \\ \\ / / \n" +
            "  \\ V /     | |     \\ V /  \n" +
            "   > <      | |      > <   \n" +
            "  / . \\    _| |_    / . \\  \n" +
            " /_/ \\_\\  |_____|  /_/ \\_\\ \n";
        
        assertEquals(expected, RomanPrinter.print(19));
    }

    @Test
    public void testPrint_Twenty_ReturnsAsciiXX() {
        String expected = 
            " __   __  __   __ \n" +
            " \\ \\ / /  \\ \\ / / \n" +
            "  \\ V /    \\ V /  \n" +
            "   > <      > <   \n" +
            "  / . \\    / . \\  \n" +
            " /_/ \\_\\  /_/ \\_\\ \n";
        
        assertEquals(expected, RomanPrinter.print(20));
    }

    @Test
    public void testPrint_Forty_ReturnsAsciiXL() {
        String expected = 
            " __   __   _       \n" +
            " \\ \\ / /  | |      \n" +
            "  \\ V /   | |      \n" +
            "   > <    | |      \n" +
            "  / . \\   | |____  \n" +
            " /_/ \\_\\  |______| \n";
        
        assertEquals(expected, RomanPrinter.print(40));
    }

    @Test
    public void testPrint_FortyNine_ReturnsAsciiXLIX() {
        String expected = 
            " __   __   _         _____   __   __ \n" +
            " \\ \\ / /  | |       |_   _|  \\ \\ / / \n" +
            "  \\ V /   | |         | |     \\ V /  \n" +
            "   > <    | |         | |      > <   \n" +
            "  / . \\   | |____    _| |_    / . \\  \n" +
            " /_/ \\_\\  |______|  |_____|  /_/ \\_\\ \n";
        
        assertEquals(expected, RomanPrinter.print(49));
    }

    @Test
    public void testPrint_Fifty_ReturnsAsciiL() {
        String expected = 
            "  _       \n" +
            " | |      \n" +
            " | |      \n" +
            " | |      \n" +
            " | |____  \n" +
            " |______| \n";
        
        assertEquals(expected, RomanPrinter.print(50));
    }
}