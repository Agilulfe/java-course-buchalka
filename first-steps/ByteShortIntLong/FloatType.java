public class FloatType {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE; // Single-precision --> 32 bits
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float min value: " + myMinFloatValue);
        System.out.println("Float max value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE; // Double-precision --> 64 bits (default)
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double min value: " + myMinDoubleValue);
        System.out.println("Double max value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3; // Doesn't hold the remainder
        float myFloatValue = 5f / 3f; // Forces Java to recognise it as a float and not an int
        // (if use a decimal, forces to use f because Java defaults to double // int for integers numbers)
        double myDoubleValue = 5d / 3d; // Forces Java to recognise it as a double and not an int
        // (but not mandatory if decimal because Java assumes it's a double)

        float newFloat = (float) 5.25; // Not idiomatic
        float altFloat = 5.25f;

        System.out.println("My intValue is " + myIntValue);
        System.out.println("My floatValue is " + myFloatValue);
        System.out.println("My doubleValue is " + myDoubleValue);

        // Challenge

        double myPoundValue = 200d;
        double myKgValue = myPoundValue * 0.45359237d;
        System.out.println("My value in KG is " + myKgValue);

    }
}