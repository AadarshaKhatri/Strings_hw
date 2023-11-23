import java.util.Scanner;
import java.lang.String;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String a = sc.nextLine().toLowerCase();
        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i = i - 1) {
            char w = a.charAt(i);
            reverse = reverse + w;



        }
        if ( a.equals(reverse)){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not palindrome");
        }
    }
}
