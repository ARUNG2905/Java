import java.util.Scanner;

public class NrightshiftArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("value");
       int n = sc.nextInt();
       int[] ar = new int[n];
       for (int i = 0; i < ar.length; i++) {
           ar[i]=sc.nextInt();

       }
       System.out.println("m times shifting ");
       int m= sc.nextInt();
    //    int temp = ar[ar.length-1];
       for (int i = 0; i < m; i++) {
        int temp = ar[ar.length-1];
     int j=ar.length-2; 
       while(j>=0){
        ar[j+1]=ar[j];
        j--;
       }
       ar[0]=temp;
    }
    //    ar[0]=temp;
       System.out.println(" ");
       for (int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
       }
           
       }
}
