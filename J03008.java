import java.util.Scanner;
public class J03008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
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
            if(s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7'){
                return false;
            }
        }
        return true;
    }
}
