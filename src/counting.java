import java.util.Scanner;
public class counting {
    public static void main(String[] args) {
        int vcount =0 ;
        int ccount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String a = sc.nextLine().toLowerCase();
        for(int i = 0; i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='i'||a.charAt(i)=='e'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                 vcount = vcount  + 1 ;

            } else {
                 ccount = ccount + 1 ;
            }
        }
        System.out.println("Total number of vowel characters: " + vcount );
        System.out.println("Total number of consonant characters: " + ccount );
    }
}
