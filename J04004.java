import java.util.Scanner;

public class J04004 {
    private long numerator;
    private long denominator;

    public J04004(long numerator, long denominator) {
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

    public void tong(J04004 a){
        this.numerator = this.numerator * a.denominator  + this.denominator * a.numerator;
        this.denominator = this.denominator * a.denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numerator = scanner.nextLong();
        long denominator = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        J04004 fraction = new J04004(numerator, denominator);
        J04004 fraction2 = new J04004(a, b);
        fraction.tong(fraction2);
        fraction.simplify();
        System.out.println(fraction);
    }
}
