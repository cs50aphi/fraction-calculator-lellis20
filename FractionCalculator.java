import java.util.*;

public class FractionCalculator
{

    public static void main(String[] args)
    {
        boolean calculate = true;
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to the Fraction Calculator!");
        System.out.println("This calculator can add, subtract, multiply, divide, or check if equal for fractions!");
        System.out.println("Press 'Q' to quit");
        System.out.println("Enter fractions in the form a/b where a and b are both integers");

        // While loop until q is
        while (calculate)
        {
            printLine();
            String oper = getOperation(kb);
            //
            if (oper.equals("Q") || oper.equals("q"))
            {
                System.out.println("\nGood luck with your math homework!");
                break;
            }
            Fraction frac1 = getFraction(kb);
            Fraction frac2 = getFraction(kb);

            // Based on operation selected, do the math and print
            switch (oper)
            {
                case "+":
                    System.out.println(frac1 + " + " + frac2 + " is " + frac1.add(frac2));
                    break;
                case "-":
                    System.out.println(frac1 + " - " + frac2 + " is " + frac1.subtract(frac2));
                    break;
                case "*":
                    System.out.println(frac1 + " * " + frac2 + " is " + frac1.multiply(frac2));
                    break;
                case "/":
                    System.out.println(frac1 + " / " + frac2 + " is " + frac1.divide(frac2));
                    break;
                case "=":
                    System.out.println(frac1 + " = " + frac2 + " is " + frac1.equals(frac2));
                    break;
                default:
                    System.out.println("Uh oh, something went terribly wrong!");
                    calculate = false;
            }
        }

    }

    // Prompt user for operation until valid
    public static String getOperation(Scanner kb)
    {
        boolean status = true;
        System.out.print("Please enter an operation (+, -, *, /, = or Q to Quit): ");
        String op;
        // While status is true, keep asking for operation
        while (status) {
            op = kb.next();
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("=") || op.equals("q") || op.equals("Q"))
            {
                status = false;
                // Valid operation, return value as string
                return op;
            }
            System.out.print("Invalid input, try again (+, -, *, /, = or Q to Quit): ");
        }
        return "Error!";
    }

    public static Fraction getFraction(Scanner kb)
    {
        boolean check = false;
        String input = "";
        System.out.print("Please enter a fraction (a/b) or integer (a): ");
        // Until validFraction test is passed, keep asking!
        while (!check)
        {
            input = kb.next();
            check = validFraction(input);
        }
        // If the input is just a whole number, create the fraction and exit
        if (isNumber(input))
        {
            Fraction specFrac = new Fraction(Integer.parseInt(input));
            return specFrac;
        }
        // Find the / and make each substring of num and denom, parse string to int
        int vinc = input.indexOf("/");
        String first = input.substring(0, vinc);
        String second = input.substring(vinc + 1);
        int num = Integer.parseInt(first);
        int denom = Integer.parseInt(second);
        Fraction fracObj = new Fraction(num, denom);
        return fracObj;
    }

    public static boolean validFraction(String frac)
    {
        // statement for if whole thing is numeric, breaks out right away
        if (isNumber(frac)) return true;
        // check for '/' sign in fraction
        int vinc = frac.indexOf("/");
        if (vinc == -1)
        {
            System.out.print("Invalid fraction. Please enter (a/b) or (a) where a and b are integers and b is not zero: ");
            return false;
        }
        String first = frac.substring(0, vinc);
        String second = frac.substring(vinc + 1);
        // make sure num and denom are numbers and denom is not equal to 0
        if (isNumber(first) && isNumber(second) && Integer.parseInt(second) != 0) return true;
        else
        {
            System.out.print("Invalid fraction. Please enter (a/b) or (a) where a and b are integers and b is not zero: ");
            return false;
        }
    }
    public static boolean isNumber(String test)
    {
        try
        {
            // returns numberformatexception if there is a non number in the string
            Integer.parseInt(test);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static void printLine()
    {
        System.out.println("---------------------------------------------------");
    }

}

