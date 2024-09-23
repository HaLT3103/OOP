import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String n = scanner.next();
            System.out.println(check(n) ? "YES" : "NO");
        }
    }

    private static boolean check(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            sum += digit;
            if (i > 0 && Math.abs(n.charAt(i) - n.charAt(i - 1)) != 2) {
                return false;
            }
        }
        return sum % 10 == 0;
    }
}
