////////////////////////////////////////////////////////////////////
// Antonio Tufano 2137972 
// Jacopo De Donà 2104894 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] letterI = {
            "  _____  ", " |_   _| ", "   | |   ", "   | |   ", "  _| |_  ", " |_____| "
        };
        String[] letterV = {
            " __      __ ", " \\\\ \\    / / ", "  \\ \\  / /  ", "   \\ \\/ /   ", "    \\  /    ", "     \\/     "
        };
        String[] letterX = {
            " __    __ ", " \\\\ \\  / / ", "  \\\\ \\/ /  ", "   >  <   ", "  / /\\ \\  ", " /_/  \\_\\ "
        };
        String[] letterL = {
            "  _       ", " | |      ", " | |      ", " | |      ", " | |____  ", " |______| "
        };
        String[] letterC = {
            "  _____  ", " / ____| ", "| |      ", "| |      ", "| |____  ", " \\_____| "
        };
        String[] letterD = {
            "  _____   ", " |  __ \\\\  ", " | |  | | ", " | |  | | ", " | |__| | ", " |_____/  "
        };
        String[] letterM = { "  __  __  ", " |  \\/  | ", " | \\  / | ", " | |\\/| | ", " | |  | | ", " |_|  |_| " };

        StringBuilder result = new StringBuilder();
        int height = 6;

        for (int i = 0; i < height; i++) {
            for (char c : romanNumber.toCharArray()) {
                if (c == 'I') {
                    result.append(letterI[i]);
                }
                else if (c == 'V') {
                    result.append(letterV[i]);
                }
                else if (c == 'X') {
                    result.append(letterX[i]);
                }
                else if (c == 'L') { 
                    result.append(letterL[i]); 
                }
                else if (c == 'C') { 
                    result.append(letterC[i]); 
                }
                else if (c == 'D') { 
                    result.append(letterD[i]); 
                }
                else if (c == 'M') { 
                    result.append(letterM[i]); 
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}