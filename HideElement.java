
import java.util.Scanner;

public class HideElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1="****";
        for (int i=4; i <s.length(); i++) {    
            s1= s1+s.charAt(i);   
        }
        System.out.println(s1);
        String s2 ="****";
        char[] ch=s.toCharArray();
        for (int i=4; i<ch.length; i++){
            s2=s2+ch[i];
        }
        System.out.println(s2);
        
    }
}
