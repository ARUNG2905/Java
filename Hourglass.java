import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the n ");
        int n = sc.nextInt();
        sc.close();

   
        for (int i = 1; i<=2*n-1; i++) {
            for (int j = 1; j<=2*n-1; j++) {
                if (i==2*n-1||i==1||i+j==2*n||i==j) {
                    System.out.print("*" + " ");
				}else{
					System.out.print(" " + " ");
				}
            }
            System.out.println();
        }
    }
    
}

