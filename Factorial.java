import java.util.Scanner;
class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        long f=1l;
        for(int i=1;i<=n;i++){
            f=i*f;

        }
        System.err.println("factorial of the number is "+f);
        sc.close();
    }
}
