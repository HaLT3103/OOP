import java.util.Scanner;
public class J03007 {
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
        int tong = 0;
        if(s.charAt(0) != '8' || s.charAt(n - 1) != '8'){
            return false;
        }
        for(int i = 0; i < n; i++){
            int c = s.charAt(i) - '0';
            tong += c;
        }
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c != s.charAt(n - i - 1)){
                return false;
            }
        }
        if(tong % 10 != 0){
            return false;
        }
        return true;
    }
}
