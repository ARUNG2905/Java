
import java.util.Scanner;

public class Stringtoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        String s = sc.nextLine();
        char[]c1=s.toCharArray();
            int rev=0;
        for (int i = 0; i <c1.length; i++) {
            rev=rev*10+(c1[i]-48);
        }
        System.out.println("integer: "+rev);
        // for (int i = 0; i <s.length(); i++) {
        //     char j=s.charAt(i);
        //     System.out.println(j);
        // }
        int r=0;
        for (int i = 0; i <s.length(); i++) {
            r=r*10+(s.charAt(i)-48);
        }
        System.out.println(r);
       sc.close();
    }
}
