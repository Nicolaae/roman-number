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
        // Arrange
        int input = 1;
        String expected = 
            "  _____  \n" +
            " |_   _| \n" +
            "   | |   \n" +
            "   | |   \n" +
            "  _| |_  \n" +
            " |_____| \n";
        
        // Act
        String actual = RomanPrinter.print(input);
        
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrint_Four_ReturnsAsciiIV() {
        // Arrange
        int input = 4;
        String expected = 
            "  _____   __      __ \n" +
            " |_   _|  \\ \\    / / \n" +
            "   | |     \\ \\  / /  \n" +
            "   | |      \\ \\/ /   \n" +
            "  _| |_      \\  /    \n" +
            " |_____|      \\/     \n";
        
        // Act
        String actual = RomanPrinter.print(input);
        
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrint_Nine_ReturnsAsciiIX() {
        // Arrange
        int input = 9;
        String expected = 
            "  _____   __   __ \n" +
            " |_   _|  \\ \\ / / \n" +
            "   | |     \\ V /  \n" +
            "   | |      > <   \n" +
            "  _| |_    / . \\  \n" +
            " |_____|  /_/ \\_\\ \n";
        
        // Act
        String actual = RomanPrinter.print(input);
        
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrint_Ten_ReturnsAsciiX() {
        // Arrange
        int input = 10;
        String expected = 
            " __   __ \n" +
            " \\ \\ / / \n" +
            "  \\ V /  \n" +
            "   > <   \n" +
            "  / . \\  \n" +
            " /_/ \\_\\ \n" ;
        
        // Act
        String actual = RomanPrinter.print(input);
        
        // Assert
        assertEquals(expected, actual);
    }
}