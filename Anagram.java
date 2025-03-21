
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
         boolean f=ianagram(s,s2);
        if(f==true){
            System.out.println("its a anagram");
        }
        else
        System.out.println("not a anagram");
    }
   public static  boolean ianagram(String s,String s2){
        int[] count = Frequencyofstring.frequency(s);
        System.out.println();
        int[] count1 = Frequencyofstring.frequency(s2);

        for (int i = 0; i < count.length; i++) {
            if(count[i]!=count1[i]){
                return false;
            }
        }
        
        return true;

    }
    
}
