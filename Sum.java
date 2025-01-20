//To find the sum of digit in the given number
import java.util.Scanner;
class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        int s=0;
        while(n!=0){
            int d=n%10;
            s=s+d;
            n=n/10;
        }
        System.err.println("sum of the digit is "+s);
        sc.close();
    }
}