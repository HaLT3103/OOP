import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        for (int i = 0; i < testCases; i++) {
            String name = scanner.nextLine();
            System.out.println(normalize(name));
        }
    }

    public static String normalize(String name) {
        name = name.trim();  // Remove leading and trailing spaces
        name = name.replaceAll("\\s+", " ");  // Replace multiple spaces with single space
        String[] words = name.split("\\s");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))  // Convert first character to upper case
              .append(word.substring(1).toLowerCase())  // Convert rest of the characters to lower case
              .append(" ");
        }

        return sb.toString().trim();  // Return the result string
    }
}
