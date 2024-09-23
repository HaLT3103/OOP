import java.util.*;
public class J03026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.equals(b)){
                System.out.println("-1");
            }
            else {
                if(a.length() < b.length()){
                    System.out.println(b.length());
                }
                else{
                    System.out.println(a.length());
                }
            }
        }
    }
}
