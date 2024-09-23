import java.util.Scanner;
public class J03024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while(testCases-- > 0){
            String c = sc.nextLine();
            int check = 0;
            int dem = 0;
            char[] s = c.toCharArray();
            for(int i = 0; i < c.length(); i++){
                if(s[i] < '0' || s[i] > '9'){
                    check = 1;
                    break;
                }
                else if(s[i] == '0'){
                    dem++;
                }
            }
            if((check == 0 && dem == c.length()) || check == 1 ){
                System.out.println("INVALID");
                continue;
            }
            int chan = 0, le = 0;
            for(char x : s){
                if((x - '0') % 2 == 0){
                    chan++;
                }
                else{
                    le++;
                }
            }
            if((c.length() % 2 == 0 && chan > le) || (c.length() % 2 == 1 && chan < le)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
