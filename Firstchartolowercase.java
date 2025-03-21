import java.util.Scanner;

public class Firstchartolowercase {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char[] c= s.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            if(i==0||c[i]!=' '&&c[i-1]==' ')
            c[i]=(char)(c[i]+32);
        }
        String s1 = new String(c);
        System.out.println(s1);
    }
}
