import java.util.*;

public class J03031 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            String s = sc.nextLine();
            int k = sc.nextInt();
            Set <Character> se = new HashSet<>();
            for(char x : s.toCharArray()){
                se.add(x);
            }
            if(26 - se.size() <= k){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
