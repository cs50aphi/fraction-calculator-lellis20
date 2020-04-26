public class FractionDriver {

    public static void main(String [] args)
    {
        Fraction myFrac = new Fraction(5, 6);
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
    }
}