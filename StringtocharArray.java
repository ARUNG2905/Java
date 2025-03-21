
import java.util.Scanner;

public class StringtocharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        char[] c= new char[s.length()];
        for (int i = 0; i < c.length; i++) {
            c[i]=s.charAt(i);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
