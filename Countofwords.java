
import java.util.Scanner;

public class Countofwords {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int count=0;
        for (int i = 0; i < c.length; i++) {
            if(i==0||c[i]!=' '&&c[i-1]==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
