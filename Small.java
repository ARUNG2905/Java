//To find the Smallest digit in the given number
import java.util.Scanner;
class Small{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int s=n%10;
        while(n!=0){
            int d=n%10;
            if(d<s){
                s=d;
            }
            n=n/10;
        }
        System.err.println("the largest number is " +s);
        sc.close();
    }
}