
import java.util.Scanner;

public class Countvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int count=0;
        
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                    count++;
            }
        }
        
        System.out.println(count);
        System.out.println("using TocharArray");
        char[] ch=s.toCharArray();
        int c1=0;
        String s1="AaEeIiOoUu";
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j <s1.length(); j++) {     
            if(ch[i]==s1.charAt(j)){
                c1++;
            }
        }
            
        }
        System.out.println(c1);
        sc.close();
    }
}
