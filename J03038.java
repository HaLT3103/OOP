import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class J03038 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set <Character> se = new HashSet<>();
        for(char c : s.toCharArray()){
            se.add(c);
        }
        System.out.println(se.size());
    }
}
