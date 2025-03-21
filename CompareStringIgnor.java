
import java.util.Scanner;

// to check to string are equal or not
public class CompareStringIgnor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        // System.out.println(s.hashCode());
        // System.out.println(s1.hashCode());
        // if(s.hashCode()==s1.hashCode()){
            
        // //     System.out.println("both are equal");
        // // }
        if(s.length()!=s1.length()){
            System.out.println("both or not equal");
        }
        if(s.equalsIgnoreCase(s1)){
            System.out.println("both are equal");
        }
    }
}
