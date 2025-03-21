
import java.util.Scanner;

public class CharinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        String s= sc.nextLine();
        char[] ch = s.toCharArray();
for (int i = 0; i < ch.length; i++) {
    System.out.println(ch[i]);
    
}
sc.close();
    }
    
}
