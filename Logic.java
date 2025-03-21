
import java.util.Scanner;

public class Logic {
    public static int[] readArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n=sc.nextInt();
        int[] ar = new int[n];
        System.err.println("Enter the array values");
        for (int i = 0; i <ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        return ar;
    }
    public static void displayArray(int[] ar){
        for (int i = 0; i <ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
