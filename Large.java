//To find the largest digit in the given number
import java.util.Scanner;
class Large{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int l=n%10;
        while(n!=0){
            int d=n%10;
            if(d>l){
                l=d;
            }
            n=n/10;
        }
        System.err.println("the largest number is " +l);
        sc.close();
    }
}