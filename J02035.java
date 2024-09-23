import java.util.*;
public class J02035 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            System.out.println(findIndexMin(n, a));
        }
    }
    public static int findIndexMin(int n, long[] a){
        int min_index = 0;
        long min_value = a[0];
        for(int i = 1; i < n; i++){
            if(a[i] < min_value){
                min_value = a[i];
                min_index = i;
            }
        }
        return min_index;
    }
}
