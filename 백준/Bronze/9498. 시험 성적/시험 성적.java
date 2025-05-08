import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testNumber = sc.nextInt();

        if (testNumber >= 90 && testNumber <= 100) {
            System.out.println("A");
        } else if(testNumber >= 80 && testNumber <= 89) {
            System.out.println("B");
        } else if(testNumber >= 70 && testNumber <= 79) {
            System.out.println("C");
        } else if (testNumber >= 60 && testNumber <= 69) {
            System.out.println("D");
        } else{
            System.out.println("F");
        }
    }
}