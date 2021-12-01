public class Main {
    public static void main(String[] args) {
        int myValue = 10000;

        int myIntMinValue = Integer.MIN_VALUE; // Width of 32
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer minimal value = " + myIntMinValue);
        System.out.println("Integer maximal value = " + myIntMaxValue);
        // Creating overflow and underflow
        System.out.println("Busted max value = " + (myIntMaxValue + 1));
        System.out.println("Busted min value = " + (myIntMinValue - 1));

        int myMaxIntTest = 2_147_483_647;
        // int myBiggerMaxInt = 2_147_483_648; Creates an error if we use a litteral which is too large

        byte myByteMinValue = Byte.MIN_VALUE; // Occupies 8 bits --> width of 8
        byte myByteMaxValue = Byte.MAX_VALUE;

        System.out.println("The byte min value is " + myByteMinValue);
        System.out.println("The byte max value is " + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE; // Width of 16
        short myShortMaxValue = Short.MAX_VALUE;

        System.out.println("The Short min value is " + myShortMinValue);
        System.out.println("The Short max value is " + myShortMaxValue);

        long myLongValue = 100L; // L forces Java to treat the litteral as a long, otherwhise consider it an int
        // Eg. long myLongValue = 2_147_483_647_654 would throw an error because bigger than max size int
        // But 2_147_483_647_654L wouldn't throw an error because converted to long
        // The opposite works the same with short. Java still considers the litteral as being an int
        // But is happy as long as the int fits in the memory footprint of the short.
        System.out.println(myLongValue);
        long myLongMinValue = Long.MIN_VALUE; // Width of 64
        long myLongMaxValue = Long.MAX_VALUE;

        System.out.println("The Long min value is " + myLongMinValue);
        System.out.println("The Long max value is " + myLongMaxValue);

        int myNewIntValue = (myIntMaxValue / 2); // No need for casting because we use two ints in the expression

        byte myNewByteValue = (byte) (myByteMinValue / 2);
        // Need to cast to byte, because we use a litteral (int) with a byte (myByteMinValue), so Java consider the all expression as an int
        // So create an error because we try to assign an int to a byte

        short myNewShortValue = (short) (myShortMinValue / 2);
    }
}