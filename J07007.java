import java.util.*;
import java.io.*;

public class J07007 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet <String> se = new TreeSet<>();
        String s;
        while(sc.hasNext()){
            s = sc.next();
            se.add(s.toLowerCase());
        }
        for(String x : se){
            System.out.println(x);
        }
    }
}
