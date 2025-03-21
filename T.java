
import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the row");
        int n=sc.nextInt();
        // System.err.println("enter the col");
        // int c=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=j){
                    System.err.print("*"+" ");
                
                }
                else{
                    System.err.print(" "+" ");
                }
            }
            System.err.println();
        }
        sc.close();
    }
    
}

