import java.util.*;

class SinhVien {
    public String msv, ten, lop, ns;
    public double gpa;

    public SinhVien(String msv, String ten, String lop, String ns, double gpa){
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }
}

public class J05003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVien[] a = new SinhVien[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String msv = "B20DCCN" + String.format("%03d", i + 1);
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            double gpa = sc.nextDouble();
            a[i] = new SinhVien(msv, ten, lop, ns, gpa);
        }
        for(SinhVien x : a){
            System.out.print(x.msv + " " + x.ten + " " + x.lop + " " + chuanHoaNgaySinh(x.ns) + " ");
            System.out.printf("%.2f\n", x.gpa);
        }
    }
    public static String chuanHoaNgaySinh(String ngaySinh) {
        String[] parts = ngaySinh.split("/");
        String ngay = parts[0];
        String thang = parts[1];
        String nam = parts[2];
        if (ngay.length() < 2) {
            ngay = "0" + ngay;
        }
        if (thang.length() < 2) {
            thang = "0" + thang;
        }
    return ngay + "/" + thang + "/" + nam;
    }
}
