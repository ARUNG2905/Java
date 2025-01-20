import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int r=0;
        int t=n;
        while(n!=0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println("the reverse of the given number is "+r);
        if(r==t){
            System.err.println("the number is palindrome");
        }
        else{
            System.err.println("the number is not a palindrome");
        }
        sc.close();
    }
}