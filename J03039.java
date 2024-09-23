import java.util.Scanner;
import java.math.BigInteger;
public class J03039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger c = a.gcd(b);
            if(a.equals(c) || b.equals(c)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
