
import java.util.Scanner;

public class Firstchartoupper {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char[] c= s.toCharArray();
        String s1="";
        for (int i = 0; i < c.length; i++) {
            if(i==0||c[i]!=' '&&c[i-1]==' ')
            c[i]=(char)(c[i]-32);
        }
for (int i = 0; i < c.length; i++) {
    s1=s1+c[i];
}
System.out.println(s1);
String s2 = new String(c);
System.out.println(s2);


    }
}
