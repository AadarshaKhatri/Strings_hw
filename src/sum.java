import java.util.Scanner;
import java.lang.String;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number/digit: ");
        int a = sc.nextInt();
        int sum = 0;
        while ( a != 0){
            int remainder = a % 10 ;
            sum = sum + remainder;
            a = a/10 ;
        }
        System.out.println("Final sum : " + sum );
    }
}