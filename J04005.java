import java.util.Scanner;
public class J04005 {
    private String ten;
    private String ngay;
    private float d1;
    private float d2;
    private float d3;

    public J04005(String ten, String ngay, float d1, float d2, float d3){
        this.ten = ten;
        this.ngay = ngay;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public float tong(){
        return this.d1 + this.d2 + this.d3;
    }

    @Override
    public String toString(){
        return ten + " " + ngay + " " + String.format("%.1f",tong());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        sc.nextLine();
        String ngay = sc.nextLine();
        sc.nextLine();
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        float d3 = sc.nextFloat();
        J04005 a = new J04005(ten, ngay, d1, d2, d3);
        System.out.println(a.toString());
    }
}
