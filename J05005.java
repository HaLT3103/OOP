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

public class J05005 {
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
        Arrays.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a1, SinhVien a2){
                return Double.compare(a2.gpa, a1.gpa);
            }
        });
        for(SinhVien x : a){
            System.out.print(x.msv + " " + normalize(x.ten) + " " + x.lop + " " + chuanHoaNgaySinh(x.ns) + " ");
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

    public static String normalize(String name) {
        name = name.trim();  // Remove leading and trailing spaces
        name = name.replaceAll("\\s+", " ");  // Replace multiple spaces with single space
        String[] words = name.split("\\s");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))  // Convert first character to upper case
              .append(word.substring(1).toLowerCase())  // Convert rest of the characters to lower case
              .append(" ");
        }

        return sb.toString().trim();  // Return the result string
    }
}
