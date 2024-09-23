import java.util.*;
public class J05081 {
    public String ma, ten, donvi;
    public int mua, ban;

    public J05081(String ma, String ten, String donvi, int mua, int ban){
        this.ma = ma;
        this.ten = ten;
        this.donvi =donvi;
        this. mua = mua;
        this.ban = ban;
    }

    public  int doanhthu(){
        return this.ban - this.mua;
    }

    @Override
    public String toString(){
        return(this.ma + " " + this.ten + " " + this.donvi + " " + this.mua + " " + this.ban + " " + this.doanhthu());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        J05081[] a = new J05081[n];
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            int mua = sc.nextInt();
            int ban = sc.nextInt(); 
            sc.nextLine();
            String ma = "MH" + String.format("%03d", i + 1);
            a[i] = new J05081(ma, ten, donvi, mua, ban);     
        }
        Arrays.sort(a, (a1, a2) -> {
            return a2.doanhthu() - a1.doanhthu();
        });
        for(J05081 x : a){
            System.out.println(x.toString());
        }
    }
}

/*
2
ao phong tre em
cai
25000
41000
ao khoac nam
cai
240000
515000
 */