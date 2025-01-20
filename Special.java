//to find special two digit product
import java.util.Scanner;
class Special{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        if(n>9&&n<100){
        int f=n/10;
        int l=n%10;
        int s=f+l;
        int p=f*l;
        int value=s+p;
        if(value==n)
        System.err.println("it is a special two digit number");
        else 
        System.err.println("it is not  a special two digit number");
        }
        else 
        System.err.println("it is not a two digit number");
        sc.close();


    }
}