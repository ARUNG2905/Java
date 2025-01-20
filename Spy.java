//to find spy number from given number
import java.util.Scanner;
class Spy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number");
        int n=sc.nextInt();
        int s=0;//to find sum
        int p=1;//to find product
        while(n!=0){
            int d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
            if(s==p)
                System.err.println("Entered number is spy number");
            
            else
                System.err.println("Entered number is not spy number");
        
            sc.close();
        
    }
}