
import java.util.Scanner;

public class Swapingflofword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int f=0;
        for (int i = 0; i <c.length; i++) {
            if((i==0&&c[i]!=' ')||(c[i]!=' '&&c[i-1]==' ')){
                f=i;
            }
                if((i==c.length-1&&c[i]!=' ')||(c[i]!=' '&&c[i+1]==' ')){
                char l=c[i];
                c[i]=c[f];
                c[f]=l;
                }
            
            
        }
        String s1="";
        for (int i = 0; i < c.length; i++) {
            s1=s1+c[i];
        }
        System.out.println(s1);
    }
}
