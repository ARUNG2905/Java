import java.util.Scanner;

 class Innerd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the n");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i+j==n+1||j-i==n-1||i-j==n-1||i+j==3*n-1||i==1||i==2*n-1||j==1||j==2*n-1){
                    System.err.print("*"+" ");
                
                }
                else{
                    System.err.print(" "+" ");
                }
            }
            System.err.println();
        }
        sc.close();
    }
    }

