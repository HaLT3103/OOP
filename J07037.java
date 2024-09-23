import java.util.*;
import java.io.*;

class DoanhNghiep implements Comparable<DoanhNghiep>{
    public String ma, ten, so;

    public DoanhNghiep(String ma, String ten, String so){
        this.ma = ma;
        this.ten = ten;
        this.so = so;
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + so;
    }

    @Override
    public int compareTo(DoanhNghiep x){
        return ma.compareTo(x.ma);
    }
}

public class J07037 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        while(t-- > 0){
            a.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(DoanhNghiep x : a){
            System.out.println(x);
        }
    }
}
