import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class J03023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String roman = scanner.nextLine();
            System.out.println(romanToDecimal(roman));
        }
    }

    public static int romanToDecimal(String str) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = values.get(str.charAt(i));
            if (i + 1 < str.length()) {
                int s2 = values.get(str.charAt(i + 1));
                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
                i++;
            }
        }
        return res;
    }
}
