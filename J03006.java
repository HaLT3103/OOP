import java.util.Scanner;
public class J03006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while(testCases-- > 0){
            String s = sc.nextLine();
            if(check(s)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean check(String s){
        int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c % 2 != 0 ){
                return false;
            }
            if(c != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
}
