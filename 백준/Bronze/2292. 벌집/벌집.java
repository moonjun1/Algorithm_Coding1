import java.util.*;

// 백준 코테
/*

벌집



 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int range = 1;
        
        if(N == 1) {
            System.out.println(1);
        } else {
            while(true) {
                range += 6 * count;
                count++;
                if(N <= range) {
                    System.out.println(count);
                    break;
                }
            }
        }


    }
}
