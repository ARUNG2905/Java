import java.util.Scanner;
class Perfectnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n/2;i++){
            if(n%i == 0)
            s= s+i;
        }
        if(s==n)
        System.err.println(n+" It is a perfect number");
        else
        System.err.println(n+" It is not a perfect number");
        sc.close();
    }
}