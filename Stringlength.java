
import java.util.Scanner;

public class Stringlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        char[] ch=s.toCharArray();
        int count=0;
        for (char c1 : ch ) {
            System.out.println(c1);
            
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
