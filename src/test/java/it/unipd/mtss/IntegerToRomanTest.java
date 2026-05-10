////////////////////////////////////////////////////////////////////
// Nicola Gava 2148613
// Julvi Myrtaj 2148612
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert_One_ReturnsI() {
        // Arrange
        int input = 1;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertEquals("I", actual);
    }

    @Test
    public void testConvert_Three_ReturnsIII() {
        // Arrange
        int input = 3;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertEquals("III", actual);
    }

    @Test
    public void testConvert_OutOfBounds_ReturnsNull() {
        // Arrange
        int input = 4;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertNull(actual);
    }
}