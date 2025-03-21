
import java.util.Scanner;


public class ReverseString {

    public static void reverseString(char[] s) {
        String s2="";
        for (int i=0; i<s.length; i++){
            s2 = s2 + s[s.length - 1 - i];
        }
        System.out.println(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();

        char[] ch = s.toCharArray();
        reverseString(ch);
        
        // String s1="";
        // for (int i=s.length()-1; i >=0; i--) {    
        //     s1= s1+s.charAt(i);   
        // }
        // System.out.println(s1);
        sc.close();
        
    }
}
