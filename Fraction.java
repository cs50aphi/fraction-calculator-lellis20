// Fraction by Luke Ellis

public class Fraction {

    private int num;
    private int denom;

    public Fraction(int top, int bot) {
        num = top;
        denom = bot;
    }

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
}