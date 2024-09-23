import java.util.Scanner;
public class J04007 {
    private String ma = "00001";
    private String ten;
    private String gt;
    private String ns;
    private String dc;
    private String ms;
    private String nk;

    public J04007(String ten, String gt, String ns, String dc, String ms, String nk){
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.ms = ms;
        this.nk = nk;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + gt + " " + ns + " " + dc + " " + ms + " " + nk;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String gt = sc.nextLine();
        String ns = sc.nextLine();
        String dc = sc.nextLine();
        String ms = sc.nextLine();
        String nk = sc.nextLine();
        J04007 a = new J04007(ten, gt, ns, dc, ms, nk);
        System.out.println(a.toString());
    }
}
