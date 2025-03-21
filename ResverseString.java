
import java.util.Scanner;

public class ResverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        char[] c=s.toCharArray();
        String s1="";
        
        for (int i = c.length-1; i >=0; i--) {
            int l=i;
            
            while(i>=0&&c[i]!=' ') {
                i--;
            }
                int k=i+1;
                
                while(k<=l){
                    s1=s1+c[k];
                    k++;
                }
                s1=s1+' ';
         }
        
        System.out.println(s1);
    }
}
