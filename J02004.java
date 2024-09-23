import java.util.Scanner;

public class J02004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int j = 0; j < testCases; j++){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            if(check(a)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean check(long[] a){
        int x = 0;
        int y = a.length - 1;
        while(x < y){
            if(a[x] != a[y]){
                return false;
            }
            else{
                x++;
                y--;
            }
        }
        return true;
    }
}
