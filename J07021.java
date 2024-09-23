import java.util.*;
import java.io.*;
public class J07021 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        String s;
        while(true){
            s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            if(a[0].compareTo("end") == 0){
                break;
            }
            String res = "";
            for(String i : a){
                System.out.print(Character.toUpperCase(i.charAt(0)) + " " + i.substring(1));
            }
            System.out.println();
        }
    }
}
