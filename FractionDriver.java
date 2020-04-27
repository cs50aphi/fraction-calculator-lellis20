import java.lang.Math;
import java.util.Scanner;

public class FractionDriver {

    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Numerator of first fraction: ");
        
        Fraction myFrac = new Fraction(5, 0);
        System.out.println("Level 1 operations: ");
        System.out.println("    Numerator: " + myFrac.getNumerator());
        System.out.println("    Denominator: " + myFrac.getDenominator());
        System.out.println("    String form: " + myFrac.toString());
        System.out.println("    Decimal form: " + myFrac.toDouble());
        System.out.println();

        Fraction sec = new Fraction(8, 9);
        System.out.println("Level 2 operations: ");
        System.out.println("    Sum of 5/6 and 8/9: " + myFrac.add(sec));
        System.out.println("    Difference of 5/6 and 8/9: " + myFrac.subtract(sec));
        System.out.println("    Product of 5/6 and 8/9: " + myFrac.multiply(sec));
        System.out.println("    Quotient of 5/6 and 8/9: " + myFrac.divide(sec));
        System.out.println();

        int i = -206;
        int j = 103;
        Fraction anFrac = new Fraction(20, 58);
        Fraction compFrac = new Fraction(30, 87);
        System.out.println("Level 3 operation: ");
        System.out.println("    GCD of " + i + " and " + j + " : " + myFrac.gcd(Math.abs(i), Math.abs(j)));
        System.out.println("    Check if 5/6 equals 8/9: " + myFrac.equals(sec));
        System.out.println("    Check if 20/58 equals 30/87: " + anFrac.equals(compFrac));
    }
}