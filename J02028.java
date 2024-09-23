// dãy con liên tiếp có tổng bằng k


import java.util.*;

public class J02028 {
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
            System.out.println(subArraySum(A, N, K) ? "YES" : "NO");
        }
    }

    static boolean subArraySum(long[] arr, int n, long sum) {
        int start = 0;
        long curr_sum = arr[0];
        for (int i = 1; i <= n; i++) {
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }
            if (curr_sum == sum) {
                return true;
            }
            if (i < n) {
                curr_sum = curr_sum + arr[i];
            }
        }
        return false;
    }
}
