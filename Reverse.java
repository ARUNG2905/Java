import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int r=0;
        while(n!=0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println("the reverse of the given number is "+r);
    }
}