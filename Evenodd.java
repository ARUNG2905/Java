import java.util.Scanner;
class Evenodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        while(n!=0){
            int d = n%10;
            if(d%2!=0){
                System.out.println(d+"--> is odd");
            } else{
                System.out.println(d+"--> is even");
            }
            n=n/10;
        }
        sc.close();
        System.out.println(n);
    }
}