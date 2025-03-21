import java.util.Scanner;

public class Hallowsqu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the n ");
        int n = sc.nextInt();
        sc.close();

   
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if (j==n||i==n||i==1||j==1) {
                    System.out.print("*" + " ");
				}else{
					System.out.print(" " + " ");
				}
            }
            System.out.println();
        }
    }
    
}
