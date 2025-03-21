
import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("index");
        int n = sc.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        boolean f= false;
        for (int i = 0; i < ar.length; i++) {
            for (int j =0; j < ar.length-1-i; j++) {
                if(ar[j]>ar[j+1]){
                  int  temp = ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                    f= true;
                }
            }
            if(f==false){
                break;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
