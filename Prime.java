//to find the number is prime number
import java.util.Scanner;
class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        int count=0;
        for (int i = 2; i < n/2; i++){
            if(n%i==0){
                count++;
                break;
            }
                
            }
            if(count==0)
            System.err.println("it is a prime number");
            else 
            System.err.println("it is not a prime number");
        }
    
}