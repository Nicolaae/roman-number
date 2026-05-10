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
    public void testPrint_Three_ReturnsAsciiIII() {
        // Arrange
        int input = 3;
        String expected = 
            "  _____    _____    _____  \n" +
            " |_   _|  |_   _|  |_   _| \n" +
            "   | |      | |      | |   \n" +
            "   | |      | |      | |   \n" +
            "  _| |_    _| |_    _| |_  \n" +
            " |_____|  |_____|  |_____| \n";
        
        // Act
        String actual = RomanPrinter.print(input);
        
        // Assert
        assertEquals(expected, actual);
    }
}