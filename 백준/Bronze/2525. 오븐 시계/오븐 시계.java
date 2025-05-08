import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nowHour = sc.nextInt();
        int nowMinute = sc.nextInt();
        int ovenTime = sc.nextInt();

        nowMinute += ovenTime;

        if (nowMinute >= 60) {
            nowHour += nowMinute/ 60;
            nowMinute = nowMinute % 60;
        }
        if (nowHour >= 24) {
            nowHour = nowHour % 24;
        }
        System.out.println(nowHour + " " + nowMinute);
    }
}