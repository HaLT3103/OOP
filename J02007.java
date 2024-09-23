import java.util.*;

public class J02007{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int t = 1; t <= testCases; t++) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Test " + t + ":");
            countOccurrences(array);
        }
    }

    public static void countOccurrences(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : array) {
            if (map.containsKey(num)) {
                System.out.println(num + " xuat hien " + map.get(num) + " lan");
                map.remove(num);
            }
        }
    }
}
