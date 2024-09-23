import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // consume newline not read by nextInt()
        Map<String, Integer> emailCount = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = scanner.nextLine().trim().toLowerCase();
            String[] parts = name.split("\\s+");
            StringBuilder email = new StringBuilder();
            email.append(parts[parts.length - 1]);
            for (int j = 0; j < parts.length - 1; j++) {
                email.append(parts[j].charAt(0));
            }
            String emailStr = email.toString();
            if (emailCount.containsKey(emailStr)) {
                int count = emailCount.get(emailStr);
                emailCount.put(emailStr, count + 1);
                emailStr += (count + 1);
            } else {
                emailCount.put(emailStr, 1);
            }
            System.out.println(emailStr + "@ptit.edu.vn");
        }
    }
}
