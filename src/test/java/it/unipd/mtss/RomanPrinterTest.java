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
        String[] lines = result.split("\n");
        assertEquals(6, lines.length);
    }

    @Test
    public void testPrint_ContainsExpectedCharacters() {
        int number = 1;
        String result = RomanPrinter.print(number);
        assertTrue(result.contains("|"));
        assertTrue(result.contains("_"));
    }

    @Test
    public void testPrint_WideNumberAlignment() {
        int number = 888;
        String result = RomanPrinter.print(number);
        String[] lines = result.split("\n");
        
        int firstLineLength = lines[0].length();
        for (String line : lines) {
            assertEquals(firstLineLength, line.length());
        }
    }
}