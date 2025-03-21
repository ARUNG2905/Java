import java.util.Scanner;

public class UppercaseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        char[] ch=s.toCharArray();
        int count =0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>64 && ch[i]<91)  {
                count++;
                System.out.println(ch[i]);
            }
        }
        System.out.println(count);
    }
}
