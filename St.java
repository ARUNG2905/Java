//To find the count of even and odd digit in given number
import java.util.Scanner;
class St{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int ec=0;
        int oc=0;
        while(n!=0){
            int d=n%10;
            if(d%2==0){
               ec++;

            }
            else{
                oc++;
                
            }
            n=n/10;
            
        }
            System.err.println("even digit count is"+ec);
            System.err.println("odd digit count is"+oc);
            sc.close();
    }
}