// Getting to know Primitive Data Type: int, byte, short, float, double, long, boolean, char


public class Course_1 {
    public static void main(String[] args) {
        // We can put _ so it can be more read-able

            // width = 32
        int integer = -2_14_74_836_4_8; // Value can store => -2147483648 to 2147483647

            // width = 8
        byte myByte =  127; // -128 to 127

            // width = 16
        short myShortVal = -32768; // -32768 to 32767

        float myFloat =  5.4f;

            // width 64
        long myLongVal = 922_33_72_03_68_54_77_58_9L;  // put "L" or "l" in the end so computer knows its long..... -9223372036854775808 to 9223372036854775807

        long result = 50_000L + 10L * (myByte + myShortVal + integer);

        boolean isJava = true; // true or false

        char x = '\u00AE'; // Unicode Character search for unicode characters for more information on google
        System.out.println("Hello world \u00AE Kida");

        String number1 = "10";  // These are strings
        String number2 = "5";

                            // Parsing the strings and treating as numbers to math
        System.out.println(Integer.parseInt(number1) +  Integer.parseInt(number2));
    }
}
