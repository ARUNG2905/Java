
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i=0;
        int j=s.length()-1;
        boolean f= false;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                
                i++;
                j--;
                
            }
            else{
                f=true;
                break;
            }
        }
        if(f==false){
                System.out.println("its a palindrome string");
        }
        else {
            System.out.println("it's not a palindrome");
        }
    }

}
