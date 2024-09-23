import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for(int i = 0; i < testCases; i++) {
            String[] s1 = scanner.nextLine().split(" ");
            String[] s2 = scanner.nextLine().split(" ");
            Set<String> set1 = new TreeSet<>(Arrays.asList(s1));
            Set<String> set2 = new TreeSet<>(Arrays.asList(s2));
            set1.removeAll(set2);
            for(String word : set1) {
                System.out.println(word);
            }
        }
        scanner.close();
    }
}
