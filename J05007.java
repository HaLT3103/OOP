import java.util.*;
import java. text.*;

class NhanVien implements Comparable<NhanVien> {
    public String ma, ten, gt, ns, dc, mt, nk;
    public static int cnt = 0;

    public NhanVien(String ten, String gt, String ns, String dc, String mt, String nk){
        this.ma = String.format("%05d", ++cnt);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mt = mt;
        this.nk = nk;
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + gt + " " + ns + " " + dc + " " + mt + " " + nk;
    } 

    @Override
    public int compareTo(NhanVien k){
        return ns.compareTo(k.ns);
    }
}

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        while(n-- > 0){
            a.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(NhanVien x : a){
            System.out.println(x.toString());
        }
    }
}
