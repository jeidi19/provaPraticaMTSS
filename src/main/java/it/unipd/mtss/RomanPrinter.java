////////////////////////////////////////////////////////////////////
// Antonio Tufano 2137972 
// Jacopo De Donà 2104894 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static final String[] LETTER_I = {
        "  _____   ", 
        " |_   _|  ", 
        "   | |    ", 
        "   | |    ", 
        "  _| |_   ", 
        " |_____|  "
    };
    private static final String[] LETTER_V = {
        " __      __ ", 
        " \\ \\    / / ", 
        "  \\ \\  / /  ", 
        "   \\ \\/ /   ", 
        "    \\  /    ", 
        "     \\/     "
    };
    private static final String[] LETTER_X = {
        " __    __ ", 
        " \\ \\  / / ", 
        "  \\ \\/ /  ", 
        "   >  <   ", 
        "  / /\\ \\  ", 
        " /_/  \\_\\ "
    };
    private static final String[] LETTER_L = {
        "  _       ", 
        " | |      ", 
        " | |      ", 
        " | |      ", 
        " | |____  ", 
        " |______| "
    };
    private static final String[] LETTER_C = {
        "  _____   ", 
        " / ____|  ", 
        "| |       ", 
        "| |       ", 
        "| |____   ", 
        " \\_____|  "
    };
    private static final String[] LETTER_D = {
        "  _____    ", 
        " |  __ \\   ", 
        " | |  | |  ", 
        " | |  | |  ", 
        " | |__| |  ", 
        " |_____/   "
    };
    private static final String[] LETTER_M = {
        "  __  __  ", 
        " |  \\/  | ", 
        " | \\  / | ", 
        " | |\\/| | ", 
        " | |  | | ", 
        " |_|  |_| "
    };

    private static String printAsciiArt(String romanNumber) {
        StringBuilder result = new StringBuilder();
        int height = 6;

        for (int i = 0; i < height; i++) {
            for (char c : romanNumber.toCharArray()) {
                if (c == 'I') {
                    result.append(LETTER_I[i]);
                }
                else if (c == 'V') {
                    result.append(LETTER_V[i]);
                }
                else if (c == 'X') {
                    result.append(LETTER_X[i]);
                }
                else if (c == 'L') { 
                    result.append(LETTER_L[i]); 
                }
                else if (c == 'C') { 
                    result.append(LETTER_C[i]); 
                }
                else if (c == 'D') { 
                    result.append(LETTER_D[i]); 
                }
                else if (c == 'M') { 
                    result.append(LETTER_M[i]); 
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}