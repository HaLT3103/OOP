import java.util.Scanner;

public class J04003 {
    private long numerator;
    private long denominator;

    public J04003(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void simplify() {
        long gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numerator = scanner.nextLong();
        long denominator = scanner.nextLong();
        J04003 fraction = new J04003(numerator, denominator);
        fraction.simplify();
        System.out.println(fraction);
    }
}
