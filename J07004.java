import java.util.*;
import java.io.*;
public class J07004 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] a = new int[1001];
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            a[n] += 1;
        }
        for(int i = 0; i < 1001; i++){
            if(a[i] != 0){
                System.out.println(i + " "  + a[i]);
            }
        }
    }
}
