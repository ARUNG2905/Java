
import java.util.Scanner;

// to check to string are equal or not
public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        // if(s.hashCode()==s1.hashCode()){
            
        // //     System.out.println("both are equal");
        // // }
        if(s.length()!=s1.length()){
            System.out.println("both or not equal");
        }
        else{
            boolean f = false;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)==s1.charAt(i)){
                    continue;

                }
                else {
                System.out.println(" both are not equal");
                    f=true;
                    break;
                }


            }
            if(f==false){
                System.out.println("both are equal");
            }
           

        }
        sc.close();
    }
}
