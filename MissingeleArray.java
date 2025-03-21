
import java.util.Scanner;

public class MissingeleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("index");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("input");
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        for (int i = 0; i < ar.length-1; i++) {
            int f=ar[i];
            int s=ar[i+1];
            for (int j = f+1; j < s; j++) {
                System.out.println(j+"");
            }
        }
    }
}
