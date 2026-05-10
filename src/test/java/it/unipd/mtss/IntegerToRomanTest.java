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
    public void testConvert_Four_ReturnsIV() {
        // Arrange
        int input = 4;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertEquals("IV", actual);
    }

    @Test
    public void testConvert_Nine_ReturnsIX() {
        // Arrange
        int input = 9;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertEquals("IX", actual);
    }

    @Test
    public void testConvert_Ten_ReturnsX() {
        // Arrange
        int input = 10;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertEquals("X", actual);
    }

    @Test
    public void testConvert_Zero_ReturnsNull() {
        // Arrange
        int input = 0;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertNull(actual);
    }

    @Test
    public void testConvert_OutOfBounds_ReturnsNull() {
        // Arrange
        int input = 11;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertNull(actual);
    }
}