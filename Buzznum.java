import java.util.Scanner;
class Buzznum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        if(n%7==0||n%10==7)
        System.err.println(n+"is a buzz number");
        else 
        System.err.println(n+" is not a buzz number");
        sc.close();
    }
}