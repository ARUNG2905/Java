
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("enter the row");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=2*r-1;j++){
                if(i+j>=r+1&&j-i<=r-1){
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
