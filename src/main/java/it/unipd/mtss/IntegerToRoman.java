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

        if (number >= 10) {
            roman.append("X");
            number -= 10;
        } 
        else if (number == 9) {
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
