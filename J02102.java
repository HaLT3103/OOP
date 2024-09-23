import java.util.Scanner;
import java.util.PriorityQueue;

public class J02102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n * n; i++) {
            pq.add(scanner.nextInt());
        }
        int[][] matrix = new int[n][n];
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;
        while (!pq.isEmpty()) {
            for (int i = colStart; i <= colEnd && !pq.isEmpty(); i++) {
                matrix[rowStart][i] = pq.poll();
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd && !pq.isEmpty(); i++) {
                matrix[i][colEnd] = pq.poll();
            }
            colEnd--;
            for (int i = colEnd; i >= colStart && !pq.isEmpty(); i--) {
                matrix[rowEnd][i] = pq.poll();
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart && !pq.isEmpty(); i--) {
                matrix[i][colStart] = pq.poll();
            }
            colStart++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
