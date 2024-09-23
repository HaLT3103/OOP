import java.util.*;

public class J08015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            long K = scanner.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextLong();
            }
            System.out.println(countPairs(A, K));
        }
        scanner.close();
    }

    private static int countPairs(long[] A, long K) {
        Map<Long, Integer> map = new HashMap<>();
        for (long num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (long num : A) {
            if (map.containsKey(K - num)) {
                count += map.get(K - num);
                if (K - num == num) {
                    count--;
                }
            }
        }
        return count / 2;
    }
}
