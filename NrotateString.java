
import java.util.Scanner;

public class NrotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        String s2="";
    //     int i=0;
    //    int j=c.length()-1;
       char[] s=c.toCharArray();
       System.out.println("enter the no of roatation");
       int n=sc.nextInt();
       for (int q = 0; q <= n; q++) {
        if(q<=n){
        for (int i=0; i<s.length; i++){
            for (int j = s.length-1; j >=0; j--) {
                
            
            char t=s[i];
              s[i]=s[j];
               s[j]=t;
            // s2 = s2 + s[s.length - 1 - i];
            }
        }
    }
    }
    for (int i = 0; i < c.length(); i++) {
        s2 = s2 + s[s.length - 1 - i];
    }
    
    //     if(q<=n){
    //     while(i<j){
    //     char t=s[i];
    //     s[i]=s[j];
    //     s[j]=t;
    //     i++;
    //     j--;
    //    }
    // }
    // }
    System.out.println(s2);
    System.out.println();
       for (int k = 0; k < s.length; k++) {
           System.out.println(s[k]);
       }
    }
}
