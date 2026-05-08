////////////////////////////////////////////////////////////////////
// Nicola Gava 2148613
// Julvi Myrtaj 2148612
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint() {
        // Test fittizio per non far arrabbiare JUnit e per evitare errori di sintassi
        assertEquals("", RomanPrinter.print(0));
    }
}