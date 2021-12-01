public class Challenge {
    public static void main(String[] args) {
        byte byteValue = 5;
        short shortValue = 30000;
        int intValue = 300000;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
        // You don't need casting for a long because it's large enough to hold the other data types
    }
}