import java.util.Scanner;
public class Primarydiag {
    
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the row");
            int r= sc.nextInt();
            System.out.println("Enter the row");
            int c=sc.nextInt();
            for(int i=1;i<=r;i++){
                for(int j=1;j<=c;j++){
                    if(i==j)
                    System.out.print("*"+" ");
                    else
                {
                    System.err.print(" "+" ");
                }
                }
                System.out.println();
            }
            sc.close();
    
        }
    
    }
    

