// Fraction by Luke Ellis
import java.lang.Math;

public class Fraction {

    private int num;
    private int denom;

    public Fraction(int top, int bot) {
        if (top < 0 && bot < 0)
        {
            num = Math.abs(top);
            denom = Math.abs(bot);
        }
        else if (bot < 0)
        {
            num = 0 - top;
            denom = Math.abs(bot);
        }
        else
        {
            num = top;
            denom = bot;
        }
    }
    public Fraction(int whole)
    {
        num = whole;
        denom = 1;
    }


    // Level 1 Operations
    public int getNumerator() {
        return num;
    }
    public int getDenominator() {
        return denom;
    }
    public String toString() {
        if (denom == 1) return "" + num;
        return num + "/" + denom;
    }
    public double toDouble() {
        try
        {
            double decimal = num / denom;
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occured. Don't use 0 as a denominator!");
        }
        return num / denom;
    }


    // Level 2 Operations
    public Fraction add(Fraction addend)
    {
        int n1 = this.getNumerator();
        int d1 = this.getDenominator();
        int n2 = addend.getNumerator();
        int d2 = addend.getDenominator();
        // common denominator, numerators in terms of common denom
        int pd1 = d1 * d2;
        n1 *= d2;
        n2 *= d1;
        Fraction sum = new Fraction(n1 + n2, pd1);
        sum.toLowestTerms();
        return sum;
    }
    public Fraction subtract(Fraction subtrahend)
    {
        int n1 = this.getNumerator();
        int d1 = this.getDenominator();
        int n2 = subtrahend.getNumerator();
        int d2 = subtrahend.getDenominator();
        // common denominator, numerators in terms of common denom
        int pd1 = d1 * d2;
        n1 *= d2;
        n2 *= d1;
        Fraction difference = new Fraction(n1 - n2, pd1);
        difference.toLowestTerms();

        return difference;
    }
    public Fraction multiply(Fraction multiplier)
    {
        int n1 = this.getNumerator();
        int d1 = this.getDenominator();
        int n2 = multiplier.getNumerator();
        int d2 = multiplier.getDenominator();
        n1 *= n2;
        d1 *= d2;
        Fraction product = new Fraction(n1, d1);
        product.toLowestTerms();

        return product;
    }
    public Fraction divide(Fraction divisor)
    {
        int n1 = this.getNumerator();
        int d1 = this.getDenominator();
        int n2 = divisor.getNumerator();
        int d2 = divisor.getDenominator();
        // Division is multiplication by the reciprocal
        n1 *= d2;
        d1 *= n2;
        Fraction quotient = new Fraction(n1, d1);
        quotient.toLowestTerms();

        return quotient;
    }


    // Level 3 Operations
    public static int gcd(int num, int denom)
    {
        // Find GCD using Euclidian Algorithm, replicated method from this video: https://www.youtube.com/watch?v=JUzYl1TYMcU
        int r = denom % num; // remainder
        int k = num; // divisor
        int l = denom; // left side
        if (num > denom)
        {
            l = num;
            k = denom;
            r = num % denom;
        }

        while (r != 0)
        {
            l = k;
            k = r;
            r = l % k;
        }
        return k;
    }
    public void toLowestTerms()
    {
        // Finds greatest common denominator of the two
        int gcd = gcd(num, denom);
        // Changes values of Fraction object num and denom, negative signs stay
        num /= gcd;
        denom /= gcd;
    }
    public boolean equals(Fraction compare)
    {
        this.toLowestTerms();
        compare.toLowestTerms();
        if (this.getNumerator() == compare.getNumerator() && this.getDenominator() == compare.getDenominator())
        {
            return true;
        }
        return false;
    }
}