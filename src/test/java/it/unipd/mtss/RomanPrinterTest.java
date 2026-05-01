////////////////////////////////////////////////////////////////////
// Antonio Tufano 2137972 
// Jacopo De Donà 2104894 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint_OutputNotNull() {
        String result = RomanPrinter.print(1);
        assertNotNull(result);
    }

    @Test
    public void testPrint_CorrectHeight() {
        int number = 10;
        String result = RomanPrinter.print(number);
        // Verifichiamo che ci siano 6 righe (5 \n + 1 finale o simile)
        String[] lines = result.split("\n");
        assertEquals(6, lines.length);
    }

    @Test
    public void testPrint_ContainsI() {
        int number = 1;
        String result = RomanPrinter.print(number);
        assertTrue(result.contains("|"));
        assertTrue(result.contains("_"));
    }

    @Test
    public void testPrint_FullRangeSymbols() {
        assertNotNull(RomanPrinter.print(5));    // V
        assertNotNull(RomanPrinter.print(50));   // L
        assertNotNull(RomanPrinter.print(100));  // C
        assertNotNull(RomanPrinter.print(500));  // D
        assertNotNull(RomanPrinter.print(1000)); // M
    }
}