import java.util.Scanner;
class Arm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        int d=0;
        int t=n;
        while(t>0){
            t=t/10;
            d++;
        }
        t=n;
        while(t>0){
            int digit=t%10;
            t=t/10;
            int power=1;
            for (int i = 0; i < d; i++) {
                power *=digit;
                
            }
            sum+=power;
        }
        if(sum==n){
        System.err.println("the number is armstrong "+n);
        }
        else{
            System.err.println("the number is not a armstrong "+n);
        }
        sc.close();
    }
}