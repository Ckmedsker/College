package Mod5;


public class Exercise_12_9 {

    public static void main(String[] args) {
		// Clears the terminal screen
		System.out.printf("\033\143");

        // valid binary number, should return 74
        System.out.println(bin2dec("01001010"));
        // invalid binary number, returns BinaryFormatException
        System.out.println(bin2dec("01001012"));
    }

    // used to convert the binary to decimal if applicable, or throw an exception otherwise
    public static int bin2dec(String input) throws BinaryFormatException {

        boolean isBinary;
        // cycling through each item in the array
        for (char c : input.toCharArray()) {
            // checking if any character in the input string contains either a 0 or a 1 and if it does not, then sets isBinary to false
            if (c != '0' && c != '1') {
                isBinary = false;
            }
        }

        // sets isBinary to true otherwise
        isBinary = true;

        // checks if the given string is binary, else it returns a BinaryFormatException
        if(isBinary) {
            int decimal = Integer.parseInt(input, 2);
            return decimal;
        }
        else {
            throw new BinaryFormatException(input + " is not a binary number!");
        }
    }
}
    
    // BinaryFormatException extends an existing exception
    class BinaryFormatException extends IllegalArgumentException {

        BinaryFormatException(String string) {
            super(string);
        }
}
