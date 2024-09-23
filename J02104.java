import java.util.*;

public class J02104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (matrix[i][j] == 1) {
                    System.out.println("(" + (i+1) + "," + (j+1) + ")");
                }
            }
        }
    }
}
