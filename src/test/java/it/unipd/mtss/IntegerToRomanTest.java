////////////////////////////////////////////////////////////////////
// Antonio Tufano 2137972 
// Jacopo De Donà 2104894 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConstructor(){
        IntegerToRoman translator = new IntegerToRoman();
    }
    @Test
    public void testConvert_OneShouldReturnI() {
        int number = 1;
        String result = IntegerToRoman.convert(number);
        assertEquals("I", result);
    }

    @Test
    public void testConvert_FiveShouldReturnV() {
        int number = 5;
        String result = IntegerToRoman.convert(number);
        assertEquals("V", result);
    }

    @Test
    public void testConvert_TenShouldReturnX() {
        int number = 10;
        String result = IntegerToRoman.convert(number);
        assertEquals("X", result);
    }

    @Test
    public void testConvert_FiftyShouldReturnL() {
        int number = 50;
        String result = IntegerToRoman.convert(number);
        assertEquals("L", result);
    }

    @Test
    public void testConvert_OneHundredShouldReturnC() {
        int number = 100;
        String result = IntegerToRoman.convert(number);
        assertEquals("C", result);
    }

    @Test
    public void testConvert_FiveHundredShouldReturnD() {
        int number = 500;
        String result = IntegerToRoman.convert(number);
        assertEquals("D", result);
    }

    @Test
    public void testConvert_OneThousandShouldReturnM() {
        int number = 1000;
        String result = IntegerToRoman.convert(number);
        assertEquals("M", result);
    }


    @Test
    public void testConvert_FourShouldReturnIV() {
        int number = 4;
        String result = IntegerToRoman.convert(number);
        assertEquals("IV", result);
    }

    @Test
    public void testConvert_NineShouldReturnIX() {
        int number = 9;
        String result = IntegerToRoman.convert(number);
        assertEquals("IX", result);
    }

    @Test
    public void testConvert_FortyShouldReturnXL() {
        int number = 40;
        String result = IntegerToRoman.convert(number);
        assertEquals("XL", result);
    }

    @Test
    public void testConvert_NinetyShouldReturnXC() {
        int number = 90;
        String result = IntegerToRoman.convert(number);
        assertEquals("XC", result);
    }

    @Test
    public void testConvert_FourHundredShouldReturnCD() {
        int number = 400;
        String result = IntegerToRoman.convert(number);
        assertEquals("CD", result);
    }

    @Test
    public void testConvert_NineHundredShouldReturnCM() {
        int number = 900;
        String result = IntegerToRoman.convert(number);
        assertEquals("CM", result);
    }


    @Test
    public void testConvert_EightShouldReturnVIII() {
        int number = 8;
        String result = IntegerToRoman.convert(number);
        assertEquals("VIII", result);
    }

    @Test
    public void testConvert_ThirtyEightShouldReturnXXXVIII() {
        int number = 38;
        String result = IntegerToRoman.convert(number);
        assertEquals("XXXVIII", result);
    }

    @Test
    public void testConvert_EightHundredEightyEightShouldReturnDCCCLXXXVIII() {
        int number = 888;
        String result = IntegerToRoman.convert(number);
        assertEquals("DCCCLXXXVIII", result);
    }

    @Test
    public void testConvert_NinetyNineShouldReturnXCIX() {
        int number = 99;
        String result = IntegerToRoman.convert(number);
        assertEquals("XCIX", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_ZeroShouldThrowException() {
        int number = 0;
        String result = IntegerToRoman.convert(number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_NegativeNumberShouldThrowException() {
        int number = -1;
        String result = IntegerToRoman.convert(number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_OverOneThousandShouldThrowException() {
        int number = 1001;
        String result = IntegerToRoman.convert(number);
    }
}