import java.util.Scanner;
class Leapyear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the year");
        int n=sc.nextInt();
        if((n%4==0 && n%100!=0) || n%400==0 )
        System.err.println(n+"its is a leap year");
        else
        System.err.println(n+"its not a leap year");
    }
}