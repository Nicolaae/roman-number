////////////////////////////////////////////////////////////////////
// Nicola Gava 2148613
// Julvi Myrtaj 2148612
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert() {
        // Test fittizio per non far arrabbiare JUnit (No runnable methods)
        assertEquals("", IntegerToRoman.convert(0));
    }
}