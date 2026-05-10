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
    public void testConvert_Four_ReturnsIII() {
        // Arrange
        int input = 4;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertEquals("IV", actual);
    }

    @Test
    public void testConvert_Six_ReturnsIII() {
        // Arrange
        int input = 6;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertEquals("VI", actual);
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
        int input = 7;
        
        // Act
        String actual = IntegerToRoman.convert(input);
        
        // Assert
        assertNull(actual);
    }
}