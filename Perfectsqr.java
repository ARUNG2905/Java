import java.util.Scanner;
class Perfectsqr{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        boolean flag =false;
        for(int i=1;i<=n/2;i++){
            System.err.println(i);
            if(i*i==n){
                flag=true;
            System.err.println( n+" its a perfect square num");
            break;
            }
        }
        if(flag == false)
        System.err.println(n+" it is not a perfect square num");
        sc.close();

    }
}