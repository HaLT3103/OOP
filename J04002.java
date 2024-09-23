import java.util.Scanner;
public class J04002 {
    private double cr;
    private double cd;
    private String color;

    public J04002(double cr, double cd, String color){
        this.cr = cr;
        this.cd = cd;
        this.color = color;
    }
    public double chuvi(){
        return 2 * (this.cd + this.cr);
    }
    public double dt(){
        return this.cd * this.cr;
    }
    public String Color(){
        return this.color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cr = sc.nextFloat();
        double cd = sc.nextFloat();
        String color = sc.nextLine();
        if(cr <= 0 || cd <= 0){
            System.out.println("INVALID");
        }
        else {
            J04002 a = new J04002(cr, cd, color);
            System.out.printf("%.0f %.0f %s", a.chuvi(), a.dt(), a.Color());
        }
    }
}
