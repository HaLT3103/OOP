import java.util.Arrays;
import java.util.Scanner;
public class J05033 {
    public int hour, minute, second;

    public J05033(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString(){
        return this.hour + " " + this.minute + " " + this.second;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        J05033[] times = new J05033[n];
        for(int i = 0; i < n; i++){
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();
            times[i] = new J05033(hour, minute, second);
        }
        Arrays.sort(times, (t1, t2) -> {
            if (t1.hour != t2.hour) {
                return t1.hour - t2.hour;
            } else if (t1.minute != t2.minute) {
                return t1.minute - t2.minute;
            } else {
                return t1.second - t2.second;
            }
        });
        for(J05033 time : times){
            System.out.println(time);
        }
    }
}
