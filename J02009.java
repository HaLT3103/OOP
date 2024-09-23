import java.util.*;
public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][2];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < 2; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            sc.close();
            for(int i = 0; i < n; i++){
                if(i % 2 == 0){
                    for(int j = 0; j < n; j++){
                        System.out.print(a[i][j] + " ");
                    }
                }
                else {
                    for(int j = n - 1; j >- 0; j--){
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
