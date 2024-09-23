import java.util.*;
import java.io.*;

public class J08022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(input[i]);
            }
            int[] R = new int[N];
            Stack<Integer> stack = new Stack<>();
            for (int i = N - 1; i >= 0; i--) {
                while (!stack.isEmpty() && stack.peek() <= A[i]) {
                    stack.pop();
                }
                R[i] = stack.isEmpty() ? -1 : stack.peek();
                stack.push(A[i]);
            }
            for (int i = 0; i < N; i++) {
                System.out.print(R[i] + " ");
            }
            System.out.println();
        }
    }
}
