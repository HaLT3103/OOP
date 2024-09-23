import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // consume newline not read by nextInt()
        for (int i = 0; i < N; i++) {
            String name = scanner.nextLine();
            String[] parts = name.trim().split("\\s+");
            String lastName = parts[0].toUpperCase();
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < parts.length; j++) {
                sb.append(Character.toUpperCase(parts[j].charAt(0)))
                  .append(parts[j].substring(1).toLowerCase())
                  .append(" ");
            }
            System.out.println(sb.toString().trim() + ", " + lastName);
        }
    }
}
