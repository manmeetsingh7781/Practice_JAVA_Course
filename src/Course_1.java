// Getting to know Primitive Data Type: int, byte, short, float, double, long

public class Course_1 {
    public static void main(String[] args) {
        // We can put _ so it can be more read-able

            // width = 32
        int integer = -2_14_74_836_4_8; // Value can store => -2147483648 to 2147483647

            // width = 8
        byte myByte =  127; // -128 to 127

            // width = 16
        short myShortVal = -32768; // -32768 to 32767

            // width 64
        long myLongVal = 922_33_72_03_68_54_77_58_9L;  // put "L" or "l" in the end so computer knows its long..... -9223372036854775808 to 9223372036854775807

        long result = 50_000L + 10L * (myByte + myShortVal + integer);
        System.out.println(result);


    }
}