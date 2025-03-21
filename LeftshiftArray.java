
import java.util.Scanner;

public class LeftshiftArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("value");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i]= sc.nextInt();
        }
        int temp = ar[0];
        int j=1;
        while(j<ar.length)
        {
            ar[j-1]=ar[j];
            j++;
            
        }
        ar[ar.length-1]=temp;
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
