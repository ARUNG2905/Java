
import java.util.Scanner;

public class Insertelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("values");
        int n = sc.nextInt();
        int t=n+1;
        int[] ar = new int[t];
        // int t=n+1;
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();

        } 
        System.out.println("enter the position ");
        int m=sc.nextInt();
      System.out.println("insert value");
        ar[m-1]=sc.nextInt();  
        // System.out.println("ouput");
        for (int i = m-1; i < t; i++) {
            if(i<=t-1)
            ar[i]=ar[i+1];
            // System.out.println(ar[i]);
        }
        // System.out.println("insert value");
        // ar[m-1]=sc.nextInt();
        System.out.println("ouput");
        for (int i = 0; i < t; i++) {
            System.out.println(ar[i]);
            
        }
        
    }
}
