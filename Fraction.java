// Fraction by Luke Ellis

public class Fraction {

    private int num;
    private int denom;

    public Fraction(int top, int bot) {
        num = top;
        denom = bot;
    }


    // Level 1 Operations
    public int getNumerator() {
        return num;
    }
    public int getDenominator() {
        return denom;
    }
    public String toString() {
        return num + "/" + denom;
    }
    public double toDouble() {
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
        // TODO ADD SIMPLIFY METHOD
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
        // TODO ADD SIMPLIFY METHOD
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
        // TODO ADD SIMPLIFY METHOD
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
        // TODO ADD SIMPLIFY METHOD
        return quotient;
    }


    // Level 3 Operations
    public static int gcd(int num, int denom)
    {
        // Find GCD using Euclidian Algorithm
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
    // public boolean equals(Fraction )
}