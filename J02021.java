import java.util.*;

public class J02021 {
    static int N, K;
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        arr = new int[K+1];
        backtrack(1);
        System.out.print("\n Tong cong co " + cnt + " to hop");
    }

    static void backtrack(int i) {
        for (int j = arr[i-1] + 1; j <= N-K+i; j++) {
            arr[i] = j;
            if (i == K) printCombination();
            else backtrack(i + 1);
        }
    }

    static void printCombination() {
        cnt++;
        for (int i = 1; i <= K; i++) System.out.print(arr[i]);
        System.out.print(" ");
    }
}
