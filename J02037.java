import java.util.*;

public class J02037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = 0, chan = 0, le = 0;
            while(sc.hasNextInt()){
                int res = sc.nextInt();
                n++;
                if(res % 2 == 0){
                    chan++;
                }
                else {
                    le++;
                }
            }
            if((n % 2 == 0 && chan > le) || (n % 2 == 1 && chan < le)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
