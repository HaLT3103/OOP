import java.util.*;
import java.math.*;
public class J03011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.gcd(b));
        }
    }
}
