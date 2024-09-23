import java.util.Scanner;
public class J03032 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while(testCases-- > 0){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            for(String x : a){
                StringBuilder sb = new StringBuilder(x);
                System.out.print(sb.reverse() + " ");
            }
            System.out.println();
        }
    }
}
