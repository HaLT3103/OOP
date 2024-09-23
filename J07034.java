import java.util.*;
import java.io.*;

class MonHoc implements Comparable<MonHoc>{
    public String ma, ten;
    public String so;
    public MonHoc(String ma, String ten, String so){
        this.ma = ma;
        this.ten = ten;
        this.so = so;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + so;
    }
    @Override
    public int compareTo(MonHoc x){
        return ten.compareTo(x.ten);
    }
}

public class J07034 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        while(n-- > 0){
            a.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(MonHoc x : a){
            System.out.println(x);
        }
    }
}
