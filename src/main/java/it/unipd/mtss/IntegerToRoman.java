////////////////////////////////////////////////////////////////////
// Antonio Tufano 2137972 
// Jacopo De Donà 2104894 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Number out of range (1-1000)");
        }

        StringBuilder roman = new StringBuilder();
        
        while (number >= 500) {
            roman.append("D");
            number -= 500;
        }
        if (number >= 400) {
            roman.append("CD");
            number -= 400;
        }
        
        while (number >= 100) {
            roman.append("C");
            number -= 100;
        }
        if (number >= 90) {
            roman.append("XC");
            number -= 90;
        }
        
        while (number >= 50) {
            roman.append("L");
            number -= 50;
        }
        if (number >= 40) {
            roman.append("XL");
            number -= 40;
        }
        while (number >= 10) {
            roman.append("X");
            number -= 10;
        } 
        if (number == 9) {
            roman.append("IX");
            number -= 9;
        }
        else if (number >= 5) {
            roman.append("V");
            number -= 5;
        } 
        else if (number == 4) {
            roman.append("IV");
            number -= 4;
        }

        while (number >= 1) {
            roman.append("I");
            number -= 1;
        }
        return roman.toString();
    }
}
