// to find the product of the given number
import java.util.Scanner;
class Product{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        int p=1;
        while(n!=0){
            int d=n%10;
            p=p*d;
            n=n/10;
        }
        System.err.println("product of the digit"+p);
        sc.close();
    }
}