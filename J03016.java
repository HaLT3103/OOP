import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        BigInteger eleven = new BigInteger("11");
        for (int i = 0; i < T; i++) {
            String N = scanner.nextLine();
            BigInteger numN = new BigInteger(N);
            BigInteger remainder = numN.remainder(eleven);
            if (remainder.equals(BigInteger.ZERO)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
