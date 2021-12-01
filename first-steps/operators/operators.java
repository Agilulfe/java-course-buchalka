
public class operators {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 and 2 are operants, + and = are the operators. 1 + 2 is an expression.
        int single = 3; // 3 is the operant, = is the operator and 3 is the expression (litteral)
        int newResult = result;
        System.out.println("New result is " + newResult);

        result = result - 1;
        System.out.println("result is " + result);
        System.out.println("New result is " + newResult); // Still 3

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        // result abreviation
        result++; // + 1
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 3;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        // if-then

        boolean isAlien = false;
        if (isAlien == true) // No semicolon (if add semicolon, the expression after will always run)
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of alien!"); // Will always run because no code block and more than 1 expression

        int topScore = 80;
        if (topScore != 100) { // Not equal
            System.out.println("You didn't got the high score!");
        }
        if (topScore <= 100) { // smaller or equal
            System.out.println("You didn't got the high score!");
        }

        // AND --> Both needs to be true
        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) { // double check with AND operator.
            // You can add parantheses for each check to make it easier to read, but be careful to operator precedence
            System.out.println("Bigger than second score, but less than 100");
        }

        // OR --> Only one needs to be true
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This should not run"); // If is looking for a boolean evaluation. This is why using = instead of == works here
            // But as we reasign to true, it will always run.
        }

        if (isCar) { //Shortcut
            System.out.println("This is a car");
        }

        if (!isCar) { //Shortcut for negation
            System.out.println("This is not a car");
        }

        boolean wasCar = isCar ? true : false; // If isCar is true, assign to true. Else assign to false
        if (wasCar) {
            System.out.println("It was a car");
        }

        // Challenge
        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double resultOperation = ((myDouble + mySecondDouble) * 100.00d) % 40.00d;
        boolean isEven = (resultOperation == 0) ? true : false;
        System.out.println(isEven);
        if (!isEven) {
            System.out.println("There is a remainder on this operation");
        }

    }
}