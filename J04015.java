import java.util.Scanner;

public class J04015 {
    public String ma;
    public String name;
    public int salary;

    public J04015(String ma, String name, Integer salary){
        this.ma = ma;
        this.name = name;
        this.salary = salary;
    }

    public int bacluong(){
        return Integer.valueOf(this.ma.substring(2));
    }

    public int phucap(){
        String chucvu = this.ma.substring(0, 2);
        if(this.ma.startsWith("HT")) return 2000000;
        if(this.ma.startsWith("HP")) return 900000;
        return 500000;
    }

    public long total_salary(){
        return this.salary * this.bacluong() + this.phucap();
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String name = sc.nextLine();
        int salary = sc.nextInt();
        J04015 gv = new J04015(ma, name, salary);
        System.out.print(gv.ma + " " + gv.name + " " + gv.bacluong() + " " + gv.phucap() + " " + gv.total_salary());
    }
}
