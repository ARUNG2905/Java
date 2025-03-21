import java.util.Scanner;

public class Firstchartoupperrelast {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char[] c= s.toCharArray();
        // for (int i = 0; i < c.length; i++) {
        //     if(c[i]==' '){
        //         c[i]=c[i];
        //     }
        //     else{
        //     c[i]=(char)(c[i]+32);
        //     }
        // }
        // String s2 = new String(c);
        // System.out.println(s2);
        // for (int i = 0; i < c.length; i++) {
        //     if(i==0||c[i]!=' '&&c[i-1]==' ')
        //     c[i]=(char)(c[i]-32);
        // }
        // String s1 = new String(c);
        // System.out.println(s1);
        for (int i = 0; i < c.length; i++) {
            if(i==0||c[i]!=' '&&c[i-1]==' '){
                if(c[i]>='a'&&c[i]<='z')
                c[i]=(char)(c[i]-32);
            }
           
            else{
               if(c[i]>='A'&&c[i]<='Z'){
                c[i]=(char)(c[i]+32);
               }
            }
        }    
        String s1 = new String(c);
        System.out.println(s1);
     }
}
