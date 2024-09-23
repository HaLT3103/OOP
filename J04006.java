import java.util.*;
import java.text.*;

class SinhVien{
    public String id, msv, ten, lop, ns;
    public float gpa;
    public static int cnt = 0;

    public SinhVien(String ten, String lop, String ns, float gpa) throws ParseException{
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        DateFormat date = new SimpleDateFormat("dd/mm/yyyy");
        this.ns = date.format(date.parse(ns));
        this.msv = String.format("B20DCCN%03d", ++cnt);
    }
    @Override
    public String toString(){
        return msv + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}

public class J04006 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.println(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat()));
    }
}
