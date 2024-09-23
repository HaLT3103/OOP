import java.util.Scanner;
import java.math.BigInteger;

public class J01024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int n = sc.nextInt();
            System.out.println(check(n));
        }
    }
    public static String check(int n){
        while(n > 0){
            int t = n % 10;
            if(t != 0 && t != 1 && t != 2){
                return "NO";
            }
            n /= 10;
        }
        return "YES";
    }
}
