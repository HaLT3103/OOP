import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            BigInteger X = new BigInteger(scanner.next());
            BigInteger Y = new BigInteger(scanner.next());
            BigInteger result = X.subtract(Y).abs();
            int l = Math.max(X.toString().length(), Y.toString().length());
            int k = result.toString().length();
            if(l == k){
                System.out.println(result);
            }
            else{
                for(int i = k; k < l; k++){
                    System.out.print("0");
                }
                System.out.println(result);
            }
        }
    }
}
