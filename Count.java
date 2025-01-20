//To find how many digit are present in given number
import java.util.Scanner;
class Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            int d=n%10;
            count++;
            n=n/10;
        }
        System.err.println("count is"+count);
            sc.close();
    }
}