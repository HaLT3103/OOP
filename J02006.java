import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(scanner.nextInt());
        }

        for (int i = 0; i < m; i++) {
            setB.add(scanner.nextInt());
        }

        setA.addAll(setB);
        List<Integer> result = new ArrayList<>(setA);
        Collections.sort(result);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
