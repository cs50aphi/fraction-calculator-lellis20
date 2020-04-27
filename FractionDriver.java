import java.lang.Math;
import java.util.Scanner;

public class FractionDriver {

    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Numerator of first fraction: ");
        int n1 = kb.nextInt();
        System.out.println("Denominator of first fraction: ");
        int d1 = kb.nextInt();
        System.out.println("Numerator of second fraction: ");
        int n2 = kb.nextInt();
        System.out.println("Denominator of second fraction: ");
        int d2 = kb.nextInt();

        Fraction myFrac = new Fraction(n1, d1);
        System.out.println("Level 1 operations for first fraction: ");
        System.out.println("    Numerator: " + myFrac.getNumerator());
        System.out.println("    Denominator: " + myFrac.getDenominator());
        System.out.println("    String form: " + myFrac.toString());
        System.out.println("    Decimal form: " + myFrac.toDouble());
        System.out.println();

        Fraction sec = new Fraction(n2, d2);
        System.out.println("Level 2 operations: ");
        System.out.println("    Sum of " + myFrac + " and " + sec + ": " + myFrac.add(sec));
        System.out.println("    Difference of " + myFrac + " and " + sec + ": " + myFrac.subtract(sec));
        System.out.println("    Product of " + myFrac + " and " + sec + ": " + myFrac.multiply(sec));
        System.out.println("    Quotient of " + myFrac + " and " + sec + ": " + myFrac.divide(sec));
        System.out.println();

        System.out.println("Level 3 operation: ");
        System.out.println("    GCD of " + myFrac + ": " + myFrac.gcd(myFrac.getNumerator(), myFrac.getDenominator()));
        System.out.println("    Check if " + myFrac + " equals " + sec + ": " + myFrac.equals(sec));
    }
}