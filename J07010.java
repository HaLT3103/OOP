import java.util.*;
import java.io.*;
import java.text.*;

class SinhVien{
    public String id, name, birth, classroom;
    public Float gpa;

    public SinhVien(String id, String name, String birth, String classroom, float gpa) throws ParseException{
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.gpa = gpa;
        DateFormat date = new SimpleDateFormat("dd/mm/yyyy");
        this.birth = date.format(date.parse(birth));
    }

    @override
    public String toString(){
        return id + " " + name + " " + classroom + " " + birth + " " + String.format("%.2f", gpa);
    }
}

public class J07010 {
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc = new Scanner(new File("SV.in"));
            int n = Integer.parseInt(sc.nextInt());
            SinhVien[] a = new SinhVien[n];
            for(int i = 0; i < n; i++){
                String name = sc.nextLine();
                String classroom = sc.nextLine();
                String birth = sc.nextLine();
                Float gpa = Float.parseFloat(sc.nextLine());
                String id = String.format("B20DCCN%03d", i + 1);
                a[i] = new SinhVien(id, name, birth, classroom, gpa);
            }
            for(SinhVien x : a){
                System.out.println(x.toString());
            }
    }
}
