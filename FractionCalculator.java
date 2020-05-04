import java.util.*;

public class FractionCalculator
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to the Fraction Calculator!");
        System.out.println("This calculator can add, subtract, multiply, divide, or check if equal for fractions!");
        System.out.println("Press 'Q' to quit at any point");
        System.out.println("Enter fractions in the form a/b where a and b are both integers");
        printLine();
        String oper = getOperation(kb);
        Fraction frac1 = getFraction(kb);
        Fraction frac2 = getFraction(kb);
        System.out.println(frac1 + " and " + frac2);

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
        return "error!";
    }

    public static Fraction getFraction(Scanner kb)
    {
        boolean check = false;
        String input = "";
        System.out.print("Please enter a fraction (a/b) or integer (a): ");
        while (!check)
        {
            input = kb.next();
            check = validFraction(input);
        }
        if (isNumber(input))
        {
            Fraction specFrac = new Fraction(Integer.parseInt(input));
            return specFrac;
        }
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
        // TODO, if statement for if whole thing is numeric
        if (isNumber(frac)) return true;
        int vinc = frac.indexOf("/");
        if (vinc == -1)
        {
            System.out.print("Invalid fraction. Please enter (a/b) or (a) where a and b are integers and b is not zero: ");
            return false;
        }
        String first = frac.substring(0, vinc);
        String second = frac.substring(vinc + 1);
        if (isNumber(first) && isNumber(second)) return true;
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
            // returns numberformatexception if
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

