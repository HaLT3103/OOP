import java.util.*;
import java.text.*;
import java.io.*;

class ThiSinh implements Comparable<ThiSinh> {
    public String ten, dt, check, ma;
    public float diem;
    public int kv;
    public static int cnt = 0;

    public ThiSinh(String ten, float diem, String dt, int kv) throws ParseException{
        this.ma = String.format("TS%02d", ++cnt);
        this.ten = ten;
        this.dt = dt;
        this.kv = kv;
        DecimalFormat df = new DecimalFormat("#.#");
        this.diem = df.format(diem + khuVucUuTien(kv) + danTocUuTien(dt));
        this.check = checkDiem(diem + khuVucUuTien(kv) + danTocUuTien(dt));
    }

    public float khuVucUuTien(int n){
        if(n == 1) return 1.5;
        if(n == 2) return 1.0;
        else return 0;
    }

    public float danTocUuTien(String s){
        if(s.equals("Kinh")) return 0;
        else return 1.5;
    }

    public String checkDiem(float x){
        if(x >= 20.5) return "Do";
        return "Truot";
    }

    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        s = s.replaceAll("\\s+", " ").trim();
        String[] a = s.split("\\s");
        for(String x : a){
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + diem + " " + check;
    }

    @Override
    public int compareTo(ThiSinh x){
        return x.diem.equals(diem);
    }
}

public class J07057 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            a.append(new ThiSinh(sc.nextLine(), Float.parseFloat(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        for(ThiSinh x : a){
            System.out.println(x);
        }
    }
}
