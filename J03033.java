import java.util.Scanner;
import java.math.BigInteger;

public class J03033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(lcm(a, b));
        }
    }
    public static BigInteger lcm(BigInteger a, BigInteger b){
        return a.multiply(b).divide(a.gcd(b));
    }
}
