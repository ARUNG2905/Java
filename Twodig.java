//to find the two digit number
import java.util.Scanner;
class Twodig{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        if(n>9&&n<100||n<-9&&n>-100)
        System.err.println("it is a two digit number");
        else
        System.err.println("it is not a two digit number");
        sc.close();
    }
}