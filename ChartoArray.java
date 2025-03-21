
import java.util.Scanner;

public class ChartoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
        char ch =s.charAt(i);
        System.out.println(ch);
        }

        char[] ch1 = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch1[i]=s.charAt(i);
            System.out.println(ch1[i]);
        }
        sc.close();
    }
}
