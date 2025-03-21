
import java.util.Scanner;

public class Consonent {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int c1=0;
        String s1="AaEeIiOoUu";
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j <s1.length(); j++) {     
            if(ch[i]!=s1.charAt(j)){
                c1++;
            }
        }
            
        }
        System.out.println(c1);
        sc.close();
    }
}
