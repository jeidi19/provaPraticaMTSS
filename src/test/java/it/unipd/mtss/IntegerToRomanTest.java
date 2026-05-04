////////////////////////////////////////////////////////////////////
// Antonio Tufano 2137972 
// Jacopo De Donà 2104894 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert_OneShouldReturnI() {
        int number = 1;
        String result = IntegerToRoman.convert(number);
        assertEquals("I", result);
    }

    @Test
    public void testConvert_FiveShouldReturnV() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvert_TenShouldReturnX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvert_FiftyShouldReturnL() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvert_OneHundredShouldReturnC() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvert_FiveHundredShouldReturnD() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvert_OneThousandShouldReturnM() {
        int number = 1000;
        String result = IntegerToRoman.convert(number);
        assertEquals("M", result);
    }


    @Test
    public void testConvert_FourShouldReturnIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvert_NineShouldReturnIX() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvert_FortyShouldReturnXL() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void testConvert_NinetyShouldReturnXC() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void testConvert_FourHundredShouldReturnCD() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void testConvert_NineHundredShouldReturnCM() {
        assertEquals("CM", IntegerToRoman.convert(900));
    }


    @Test
    public void testConvert_EightShouldReturnVIII() {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void testConvert_ThirtyEightShouldReturnXXXVIII() {
        assertEquals("XXXVIII", IntegerToRoman.convert(38));
    }

    @Test
    public void testConvert_EightHundredEightyEightShouldReturnDCCCLXXXVIII() {
        assertEquals("DCCCLXXXVIII", IntegerToRoman.convert(888));
    }

    @Test
    public void testConvert_NinetyNineShouldReturnXCIX() {
        assertEquals("XCIX", IntegerToRoman.convert(99));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_ZeroShouldThrowException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_NegativeNumberShouldThrowException() {
        IntegerToRoman.convert(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_OverOneThousandShouldThrowException() {
        IntegerToRoman.convert(1001);
    }
}