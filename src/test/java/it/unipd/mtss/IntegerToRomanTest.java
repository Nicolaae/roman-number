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
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvert_Four_ReturnsIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvert_Nine_ReturnsIX() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvert_Ten_ReturnsX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvert_Fourteen_ReturnsXIV() {
        assertEquals("XIV", IntegerToRoman.convert(14));
    }

    @Test
    public void testConvert_Nineteen_ReturnsXIX() {
        assertEquals("XIX", IntegerToRoman.convert(19));
    }

    @Test
    public void testConvert_Twenty_ReturnsXX() {
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testConvert_ThirtyNine_ReturnsXXXIX() {
        assertEquals("XXXIX", IntegerToRoman.convert(39));
    }

    @Test
    public void testConvert_Forty_ReturnsXL() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void testConvert_FortyNine_ReturnsXLIX() {
        assertEquals("XLIX", IntegerToRoman.convert(49));
    }

    @Test
    public void testConvert_Fifty_ReturnsL() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvert_Ninety_ReturnsXC() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void testConvert_NinetyNine_ReturnsXCIX() {
        assertEquals("XCIX", IntegerToRoman.convert(99));
    }

    @Test
    public void testConvert_OneHundred_ReturnsC() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvert_FourHundred_ReturnsCD() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void testConvert_FourHundredNinetyNine_ReturnsCDXCIX() {
        assertEquals("CDXCIX", IntegerToRoman.convert(499));
    }

    @Test
    public void testConvert_FiveHundred_ReturnsD() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvert_Zero_ReturnsNull() {
        assertNull(IntegerToRoman.convert(0));
    }

    @Test
    public void testConvert_OutOfBounds_ReturnsNull() {
        assertNull(IntegerToRoman.convert(501));
    }
}