import java.util.Scanner;
class Num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = sc.nextInt();
        int i=1;
        while (n>=i) {
            System.out.println(n);
            n--;
            
        }
    }
}