////////////////////////////////////////////////////////////////////
// Antonio Tufano 2137972 
// Jacopo De Donà 2104894 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert_MinimumValue() {
        int number = 1;
        String result = IntegerToRoman.convert(number);
        assertEquals("I", result);
    }

    @Test
    public void testConvert_MaximumValue() {
        int number = 1000;
        String result = IntegerToRoman.convert(number);
        assertEquals("M", result);
    }

    @Test
    public void testConvert_SubtractiveNotation() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    public void testConvert_ComplexNumber() {
        int number = 888;
        String result = IntegerToRoman.convert(number);
        assertEquals("DCCCLXXXVIII", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_UnderRange() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_OverRange() {
        IntegerToRoman.convert(1001);
    }
}