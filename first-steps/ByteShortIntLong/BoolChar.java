public class BoolChar {
    public static void main(String[] args) {
        char myChar = 'D'; // Width of 16
        char myUniCode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUniCode);
        char myCopyright = '\u00A9';
        System.out.println(myCopyright);
        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        String myString = "This is a string";
        System.out.println("My string is" + myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        myString = myString + " \u00A9 2021";
        System.out.println(myString);

        String numberString = "250.50";
        numberString = numberString + "50.50";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString); // 1050
    }
}