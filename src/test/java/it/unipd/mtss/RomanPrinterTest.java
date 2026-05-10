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

    @Test
    public void testPrint_Ninety_ReturnsAsciiXC() {
        String expected = 
            " __   __    _____  \n" +
            " \\ \\ / /   / ____| \n" +
            "  \\ V /   | |      \n" +
            "   > <    | |      \n" +
            "  / . \\   | |____  \n" +
            " /_/ \\_\\   \\_____| \n";
        
        assertEquals(expected, RomanPrinter.print(90));
    }

    @Test
    public void testPrint_NinetyNine_ReturnsAsciiXCIX() {
        String expected = 
            " __   __    _____    _____   __   __ \n" +
            " \\ \\ / /   / ____|  |_   _|  \\ \\ / / \n" +
            "  \\ V /   | |         | |     \\ V /  \n" +
            "   > <    | |         | |      > <   \n" +
            "  / . \\   | |____    _| |_    / . \\  \n" +
            " /_/ \\_\\   \\_____|  |_____|  /_/ \\_\\ \n";
        
        assertEquals(expected, RomanPrinter.print(99));
    }

    @Test
    public void testPrint_OneHundred_ReturnsAsciiC() {
        String expected = 
            "   _____  \n" +
            "  / ____| \n" +
            " | |      \n" +
            " | |      \n" +
            " | |____  \n" +
            "  \\_____| \n";
        
        assertEquals(expected, RomanPrinter.print(100));
    }

    @Test
    public void testPrint_FourHundred_ReturnsAsciiCD() {
        String expected = 
            "   _____    _____   \n" +
            "  / ____|  |  __ \\  \n" +
            " | |       | |  | | \n" +
            " | |       | |  | | \n" +
            " | |____   | |__| | \n" +
            "  \\_____|  |_____/  \n";
        
        assertEquals(expected, RomanPrinter.print(400));
    }

    @Test
    public void testPrint_FourHundredNinetyNine_ReturnsAsciiCDXCIX() {
        String expected = 
            "   _____    _____    __   __    _____    _____   __   __ \n" +
            "  / ____|  |  __ \\   \\ \\ / /   / ____|  |_   _|  \\ \\ / / \n" +
            " | |       | |  | |   \\ V /   | |         | |     \\ V /  \n" +
            " | |       | |  | |    > <    | |         | |      > <   \n" +
            " | |____   | |__| |   / . \\   | |____    _| |_    / . \\  \n" +
            "  \\_____|  |_____/   /_/ \\_\\   \\_____|  |_____|  /_/ \\_\\ \n";
        
        assertEquals(expected, RomanPrinter.print(499));
    }

    @Test
    public void testPrint_FiveHundred_ReturnsAsciiD() {
        String expected = 
            "  _____   \n" +
            " |  __ \\  \n" +
            " | |  | | \n" +
            " | |  | | \n" +
            " | |__| | \n" +
            " |_____/  \n";
        
        assertEquals(expected, RomanPrinter.print(500));
    }

    @Test
    public void testPrint_NineHundred_ReturnsAsciiCM() {
        String expected = 
            "   _____    __  __  \n" +
            "  / ____|  |  \\/  | \n" +
            " | |       | \\  / | \n" +
            " | |       | |\\/| | \n" +
            " | |____   | |  | | \n" +
            "  \\_____|  |_|  |_| \n";
        
        assertEquals(expected, RomanPrinter.print(900));
    }

    @Test
    public void testPrint_NineHundredNinetyNine_ReturnsAsciiCMXCIX() {
        String expected = 
            "   _____    __  __   __   __    _____    _____   __   __ \n" +
            "  / ____|  |  \\/  |  \\ \\ / /   / ____|  |_   _|  \\ \\ / / \n" +
            " | |       | \\  / |   \\ V /   | |         | |     \\ V /  \n" +
            " | |       | |\\/| |    > <    | |         | |      > <   \n" +
            " | |____   | |  | |   / . \\   | |____    _| |_    / . \\  \n" +
            "  \\_____|  |_|  |_|  /_/ \\_\\   \\_____|  |_____|  /_/ \\_\\ \n";
        
        assertEquals(expected, RomanPrinter.print(999));
    }

    @Test
    public void testPrint_OneThousand_ReturnsAsciiM() {
        String expected = 
            "  __  __  \n" +
            " |  \\/  | \n" +
            " | \\  / | \n" +
            " | |\\/| | \n" +
            " | |  | | \n" +
            " |_|  |_| \n";
        
        assertEquals(expected, RomanPrinter.print(1000));
    }
}