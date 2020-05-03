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
        System.out.println(oper);
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



    public static void printLine()
    {
        System.out.println("---------------------------------------------------");
    }
}

